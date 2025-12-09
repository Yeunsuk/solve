import java.util.*; //6126(DP) Cow cash
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int v = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());
    long[] dp = new long[n+1];
    int[] arr = new int[v];
    dp[0] = 1;
    
    for(int i = 0; i < v; i++) arr[i] = Integer.parseInt(br.readLine());
    for(int t : arr) for(int i = t; i <= n; i++) dp[i] += dp[i-t];
    bw.write(String.valueOf(dp[n]));
    bw.close();
  }
}