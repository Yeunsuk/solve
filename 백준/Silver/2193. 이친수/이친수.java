import java.util.*; //2193(dp) 이친수
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    long[] dp = new long[91];
    dp[1] = 1;
    dp[2] = 1;
    
    for(int i = 3; i <= num; i++) dp[i] = dp[i-1] + dp[i-2];
    bw.write(String.valueOf(dp[num]));
    bw.close();
  }
}