import java.util.*; //15624(수학) 피보나치 수 7
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long[] dp = new long[1_000_001];
    int n = Macro(br.readLine());
    dp[1] = 1;
    
    for(int i = 2; i <= n; i++) dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
    bw.write(String.valueOf(dp[n]));
    bw.close();
  }
}