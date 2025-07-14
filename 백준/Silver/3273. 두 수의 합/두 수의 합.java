import java.util.*; //3273(정렬) 두 수의 합
import java.io.*;

public class Main {
    static int stoi(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()), cnt = 0, lt = 0, rt = num - 1;
        int arr[] = new int[num];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int j = 0; j < num; j++) arr[j] = Integer.parseInt(st.nextToken());
        int std = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
            
        while(lt < rt) {
            long sum = (long) arr[lt] + arr[rt];
            if(sum > std) rt--;
            else if(sum < std) lt++;
            else {
                cnt++;
                lt++;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.close();
    }
}