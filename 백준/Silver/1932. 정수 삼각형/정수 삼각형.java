import java.util.*; //1932(dp) 정수 삼각형
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int rlt = 0, i, j;
    StringTokenizer st;
    int n = Macro(br.readLine());
    int[][] dp = new int[n + 1][n + 1];
    int[][] arr = new int[n + 1][n + 1];

    for(i = 1; i < n + 1; i++) {
      st = new StringTokenizer(br.readLine());
      for(j = 1; j < i + 1; j++) {
        arr[i][j] = Macro(st.nextToken());
      }
    }

    br.close();
    for(i = 1; i < n + 1; i++) {
      for(j = 1; j < n + 1; j++) {
        dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + arr[i][j];
      }
    }
    
    for(i = 1; i < n + 1; i++) if(rlt < dp[n][i]) rlt = dp[n][i]; 
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}