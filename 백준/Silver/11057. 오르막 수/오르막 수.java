import java.util.*; //11057(dp) 오르막 수
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine()), rlt = 0;
    int dp[][] = new int[1001][10];
    
    for(int i = 0; i < 10; i++) dp[1][i] = 1;
    for(int i = 2; i <= num; i++) {
      for(int j = 0; j < 10; j++) {
        if(j == 0) {
          dp[i][0] = 1;
          continue;
        }
        dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 10007;
      }
    }

    for(int i = 0; i < 10; i++) rlt += dp[num][i];
    bw.write(String.valueOf(rlt%10007)); 
    bw.close();
  }
}