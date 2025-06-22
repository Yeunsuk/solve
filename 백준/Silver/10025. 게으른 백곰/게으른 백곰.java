import java.util.*; //10025(누적합) 게으른 백곰
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int num = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[1_000_001];
        long sum = 0, max = 0;
        
        for(int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            int tmp = Integer.parseInt(st.nextToken());
            arr[Integer.parseInt(st.nextToken())] = tmp;
        }

        k = Math.min(2 * k + 1, 1_000_001);
        for(int i = 0; i < k; i++) sum += arr[i];
        max = sum;
        
        for(int i = k; i < 1_000_001; i++) {
            sum += arr[i] - arr[i - k];
            max = Math.max(max, sum);
        }
        
        bw.write(String.valueOf(max));
        bw.close();
    }
}