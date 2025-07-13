import java.util.*; //9728(자료구조) Pair Sum
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Test = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < Test; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken()), cnt = 0;
            int std = Integer.parseInt(st.nextToken()), lt = 0;
            int[] arr = new int[num];
            

            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < num; j++) arr[j] = Integer.parseInt(st.nextToken());
            int rt = arr.length - 1;
            Arrays.sort(arr);
            
            while(lt < rt) {
                long sum = (long) arr[lt] + arr[rt];
                if(sum == std) {
                    cnt++;
                    lt++;
                    rt--;
                }else if(sum < std) lt++;
                else rt--;
            }
            
            sb.append("Case #").append(i + 1).append(": ").append(cnt).append("\n");
        }

        bw.write(sb.toString());
        bw.close();
    }
}