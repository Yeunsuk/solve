import java.util.*; //1535(DP) 안녕
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num = Integer.parseInt(st.nextToken());
    int[][] arr = new int[num+1][2];
    int[] dp = new int[101];

    st = new StringTokenizer(br.readLine());
    for(int i = 1; i <= num; i++) arr[i][0] = Integer.parseInt(st.nextToken());
    
    st = new StringTokenizer(br.readLine());
    for(int i = 1; i <= num; i++) arr[i][1] = Integer.parseInt(st.nextToken());
    
    for(int i = 1; i <= num; i++) {
      for(int j = 99; j >= arr[i][0]; j--) {
        if(j >= arr[i][0]) dp[j] = Math.max(dp[j], dp[j-arr[i][0]] + arr[i][1]);
      }
    }
    
    bw.write(String.valueOf(dp[99]));
    bw.close();
  }
}