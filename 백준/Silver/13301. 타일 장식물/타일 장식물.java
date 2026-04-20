import java.util.*; //13301(dp) 타일 장식물
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine());
    long [] dp = new long[82];
    dp[1] = 1;
    dp[2] = 1;

    for(int i = 3; i < n + 2; i++) dp[i] = dp[i - 1] + dp[i - 2];
    bw.write(String.valueOf(2 * dp[n] + 2 * dp[n + 1]));
    bw.flush();
  }
}