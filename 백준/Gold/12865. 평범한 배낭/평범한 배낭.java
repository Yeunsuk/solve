import java.util.*; //12865(DP) 평범한 배낭
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    int[][] dp = new int[101][100_001];
    int[][] arr = new int[num+1][2];
    
    for(int i = 1; i <= num; i++) {
      st = new StringTokenizer(br.readLine());
      arr[i][0] = Integer.parseInt(st.nextToken());
      arr[i][1] = Integer.parseInt(st.nextToken());
    }  
    
    for(int i = 1; i <= num; i++) {
        for(int j = 1; j<= k; j++) {
            if(j >= arr[i][0]) dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-arr[i][0]] + arr[i][1]);
            else dp[i][j] = dp[i-1][j];
        }
    }
    bw.write(String.valueOf(dp[num][k]));
    bw.close();
  }
}