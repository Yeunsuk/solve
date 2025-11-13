import java.util.*; //2565(dp) 전깃줄
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine()), rlt = 0;
    int arr[][] = new int[n][2];
    int dp[] = new int[n];
    
    for(int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      arr[i][0] = Integer.parseInt(st.nextToken());
      arr[i][1] = Integer.parseInt(st.nextToken());
    }
    
    Arrays.sort(arr, (a, b) -> {
      if (a[0] == b[0]) return a[1] - b[1];
      return a[0] - b[0];
    });
    
    for(int i = 0; i < n; i++) {
      dp[i] = 1;
      
      for(int j = 0; j < i; j++) {
          if(arr[i][1] > arr[j][1] && dp[j] + 1 > dp[i]) dp[i] = dp[j] + 1;
      }
      
      rlt = Math.max(rlt, dp[i]);
    }
    
    bw.write(String.valueOf(n - rlt)); 
    bw.close();
  }
}