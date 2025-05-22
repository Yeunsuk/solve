import java.util.*; //2798(브루트포스) 블랙잭
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken()), sum = 0;
        int m = Integer.parseInt(st.nextToken()), rlt = 0;
        int[] arr = new int[num];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < num; i++) arr[i] = Integer.parseInt(st.nextToken());

        for(int i = 0; i < num; i++) {
            for(int j = i + 1; j < num; j++) {
                sum = arr[i] + arr[j];
                if(sum > m) continue;
                for(int k = j + 1; k < num; k++) {
                    if(sum + arr[k] <= m) rlt = Math.max(rlt, sum + arr[k]);
                }
            }
        }

        bw.write(String.valueOf(rlt));
        bw.close();
    }
}