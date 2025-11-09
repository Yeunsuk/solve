import java.util.*; //1699(dp) 제곱수의 합
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int dp[] = new int[num+1];
    
    for(int i = 1; i <= num; i++) dp[i] = i;
    for(int i = 1; i <= num; i++) {
      for (int j = 1; j * j <= i; j++) dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
    }
    
    bw.write(String.valueOf(dp[num])); 
    bw.close();
  }
}