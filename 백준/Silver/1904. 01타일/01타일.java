import java.util.*; //1904(dp) 01타일
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int[] dp = new int[num+1];
    dp[0] = 1; dp[1] = 1;
    
    for(int i = 2; i <= num; i++) dp[i] = (dp[i-1] + dp[i-2]) % 15746;
    bw.write(String.valueOf(dp[num])); 
    bw.close();
  }
}