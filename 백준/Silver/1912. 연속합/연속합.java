import java.util.*; //1912(dp) 연속합
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine()), max = -1_000;
    int[] arr = new int[num+1];
    int[] dp = new int[num+1];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 1; i <= num; i++) arr[i] = Integer.parseInt(st.nextToken());
    for(int i = 1; i <= num; i++) {
      dp[i] = Math.max(arr[i], dp[i-1] + arr[i]);
      max = Math.max(max, dp[i]);
    }
    
    bw.write(String.valueOf(max));
    bw.close();
  }
}