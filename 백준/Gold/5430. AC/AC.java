import java.util.*; //5430(자료구조) AC
import java.io.*;

public class Main {
    public static int[] inputarr(String input) {
        List<Integer> list = new ArrayList<>();
        boolean flag = false;
        int num = 0;

        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if(Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
                flag = true;
            }else {
                if(flag) {
                    list.add(num);
                    flag = false;
                    num = 0;
                }
            }
        }

        if(flag) list.add(num);
        int[] rlt = new int[list.size()];
        for(int i = 0; i < rlt.length; i++) rlt[i] = list.get(i);

        return rlt;
    }

    public static void reverseArray(int[] arr) {
        int rt = arr.length - 1, lt = 0;

        while (lt < rt) {
            int tmp = arr[lt];
            arr[lt] = arr[rt];
            arr[rt] = tmp;
            lt++;
            rt--;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Test = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(Test-- > 0) {
            String fun = br.readLine();
            int num = Integer.parseInt(br.readLine());
            int[] arr = inputarr(br.readLine());
            int stt = 0, end = num, cnt = 0, std = 1;

            for(int i = 0; i < fun.length(); i++) {
                if(fun.charAt(i) == 'D') {
                    cnt++;
                }else {
                    if(std == 1) stt += cnt;
                    else end -= cnt;
                    std *= -1;
                    cnt = 0;
                }
            }

            if(std == 1) stt += cnt;
            else end -= cnt;

            if(stt > end) sb.append("error\n");
            else {
                int[] rlt = Arrays.copyOfRange(arr, stt, end);
                if(std == -1) reverseArray(rlt);

                sb.append("[");
                for(int i = 0; i < rlt.length; i++) sb.append((i != rlt.length - 1) ? rlt[i] + "," : rlt[i]);
                sb.append("]\n");
            }
        }

        bw.write(sb.toString());
        bw.close();
    }
}