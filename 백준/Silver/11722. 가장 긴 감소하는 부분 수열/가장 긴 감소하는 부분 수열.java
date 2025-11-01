import java.util.*; //11722(dp) 가장 긴 감소하는 부분 수열
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine()), max = 0;
    int[] arr = new int[num];
    int[] dp = new int[num];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < num; i++) arr[i] = Integer.parseInt(st.nextToken());

    for(int i = 0; i < num; i++) {
      dp[i] = 1;

      for(int j = 0; j < i; j++) if(arr[j] > arr[i]) dp[i] = Math.max(dp[i], dp[j] + 1);
      max = Math.max(max, dp[i]);
    }

    bw.write(String.valueOf(max));
    bw.close();
  }
}