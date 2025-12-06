import java.util.*; //5350(DP) Transport
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    while(Test-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int num = Integer.parseInt(st.nextToken());
      int w = Integer.parseInt(st.nextToken());
      int[][] arr = new int[num+1][2];
      int[] dp = new int[w + 1];
      
      for(int i = 1; i <= num; i++) {
        st = new StringTokenizer(br.readLine());
        arr[i][0] = Integer.parseInt(st.nextToken());
        arr[i][1] = Integer.parseInt(st.nextToken());
      }

      for(int i = 1; i <= num; i++) {
        for(int j = w; j >= arr[i][0]; j--) {
          if(arr[i][0] <= j) dp[j] = Math.max(dp[j], dp[j-arr[i][0]] + arr[i][1]);
        }
      }

      sb.append(dp[w] + "\n");
    }
    
    
    bw.write(sb.toString());
    bw.close();
  }
}