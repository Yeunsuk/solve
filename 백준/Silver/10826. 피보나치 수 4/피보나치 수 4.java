import java.util.*; //10826(dp) 피보나치 수 4
import java.math.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    if(n == 0) bw.write("0\n");
    else if (n == 1) bw.write("1\n");
    else {
      BigInteger[] dp = new BigInteger[n + 1];
      dp[0] = new BigInteger("0");
      dp[1] = new BigInteger("1");
      
      for (int i = 2; i <= n; i++) dp[i] = dp[i - 2].add(dp[i - 1]);
      bw.write(String.valueOf(dp[n]));
    }
    bw.close();
  }
}