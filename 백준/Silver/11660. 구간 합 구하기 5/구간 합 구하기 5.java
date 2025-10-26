import java.util.*; //11660(dp) 구간 합 구하기 5
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    StringBuilder sb = new StringBuilder();
    int[][] arr = new int[n + 1][n + 1];
    int[][] dp = new int[n + 1][n + 1];

    for (int i = 1; i <= n; i++) {
        st = new StringTokenizer(br.readLine());
        for (int j = 1; j <= n; j++) {
            arr[i][j] = Integer.parseInt(st.nextToken());
            dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + arr[i][j];
        }
    }

    for(int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int a1 = Integer.parseInt(st.nextToken());
      int b1 = Integer.parseInt(st.nextToken());
      int a2 = Integer.parseInt(st.nextToken());
      int b2 = Integer.parseInt(st.nextToken());

      int rlt = dp[a2][b2] - dp[a1 - 1][b2] - dp[a2][b1 - 1] + dp[a1 - 1][b1 - 1];
      sb.append(rlt).append("\n");
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}