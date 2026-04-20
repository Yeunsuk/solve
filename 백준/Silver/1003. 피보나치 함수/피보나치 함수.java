import java.util.*; //1003(dp) 피보나치 함수
import java.io.*;

public class Main {
  static int[][] dp = new int[41][2];
  
  static int[] Fibo(int n) {
    if(dp[n][0] == -1 || dp[n][1] == -1) {
      dp[n][0] = Fibo(n-1)[0] + Fibo(n-2)[0];
      dp[n][1] = Fibo(n-1)[1] + Fibo(n-2)[1];
    }
    return dp[n];
  }
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < 2; i++) for(int j = 0; j < 41; j++) dp[j][i] = -1;
    dp[0][0] = 1; dp[1][0] = 0;
    dp[0][1] = 0; dp[1][1] = 1;

    while(Test-- > 0) {
      int n = Integer.parseInt(br.readLine());
      
      Fibo(n);
      sb.append(dp[n][0]).append(" ").append(dp[n][1]).append('\n');
    }
    System.out.print(sb);
  }
}