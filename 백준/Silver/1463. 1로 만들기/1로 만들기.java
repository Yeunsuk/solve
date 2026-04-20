import java.util.*; //1463(dp) 1로 만들기
import java.io.*;

public class Main {
  static int[] dp;
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    dp = new int[n + 1];
    dp[0] = dp[1] = 0;
    br.close();

    for(int i = 2; i < n + 1; i++) {
      dp[i] = dp[i - 1] + 1;
      if(i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);
      if(i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1);
    }
    
    System.out.print(dp[n]);
  }
}