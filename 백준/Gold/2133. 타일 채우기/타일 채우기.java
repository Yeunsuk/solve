import java.util.*; //2133(dp) 타일 채우기
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int dp[] = new int[31];
    dp[0] = 1;
    
    for(int i = 2; i < 31; i+=2) {
      dp[i] = dp[i-2] * 3;
      for(int j = i-4; j > -1; j-=2) dp[i] += 2*dp[j];
    }
    
    bw.write(String.valueOf(dp[num])); 
    bw.close();
  }
}