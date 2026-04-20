import java.util.*; //2670(dp) 연속부분최대곱
import java.math.*;
import java.io.*;

public class Main {
  static double Macro(String str) {
    return Double.parseDouble(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    double[] arr = new double[10_001];
    double[] dp = new double[10_001];
    double tmp = 0;
    
    for(int i = 1; i <= n; i++) {
      arr[i] = Macro(br.readLine());
      dp[i] = Math.max(arr[i], dp[i - 1] * arr[i]);
      tmp = Math.max(tmp, dp[i]);
    }
    
    bw.write(String.format("%.3f", tmp));
    bw.close();
  }
}