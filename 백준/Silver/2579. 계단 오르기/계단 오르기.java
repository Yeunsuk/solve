import java.util.*; //2579(DP) 계단 오르기
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine()) + 1;
    int[] arr = new int[num];
    int[] dp = new int[num];
    
    for(int i = 1; i < num; i++) arr[i] = Integer.parseInt(br.readLine());
    
    dp[1] = arr[1];
    if(num - 1 >= 2) dp[2] = arr[1] + arr[2];
    for(int i = 3; i < num; i++) dp[i] = Math.max(dp[i-2] , dp[i-3] + arr[i-1]) + arr[i];
    

    bw.write(String.valueOf(dp[num-1]));
    bw.close();
  }
}