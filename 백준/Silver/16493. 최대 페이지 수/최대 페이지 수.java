import java.util.*; //16493(DP) 최대 페이지 수
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int k = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());
    int[][] arr = new int[n+1][2];
    int[] dp = new int[k + 1];
    
    for(int i = 1; i <= n; i++) {
      st = new StringTokenizer(br.readLine());
      arr[i][0] = Integer.parseInt(st.nextToken());
      arr[i][1] = Integer.parseInt(st.nextToken());
    }
    
    for(int i = 1; i <= n; i++) {
      for(int j = k; j >= arr[i][0]; j--) {
        if(arr[i][0] <= j) dp[j] = Math.max(dp[j], dp[j-arr[i][0]] + arr[i][1]);
      }
    }
    
    bw.write(String.valueOf(dp[k]));
    bw.close();
  }
}