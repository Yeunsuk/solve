import java.util.*; //12852(dp) 1로 만들기 2
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    int dp[] = new int[n+1];
    
    for(int i = 2; i <= n; i++) {
      dp[i] = dp[i - 1] + 1;
      if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1);
      if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);
    }
    
    sb.append(dp[n]).append("\n");
    while(n > 0) {
      sb.append(n).append(" ");
      if(n % 3 == 0 && dp[n] == dp[n/3] + 1) n /= 3;
      else if(n % 2 == 0 && dp[n] == dp[n/2] + 1) n /= 2;
      else n -= 1;
    }
    
    bw.write(sb.toString()); 
    bw.close();
  }
}