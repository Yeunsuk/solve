import java.util.*; //2156(dp) 포도주 시식
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int[] arr = new int[num+1];
    int[] dp = new int[num+1];

    for(int i = 1; i <= num; i++) arr[i] = Integer.parseInt(br.readLine());
    
    if(num >= 1) dp[1] = arr[1];
    if(num >= 2) dp[2] = arr[1] + arr[2];
    if(num >= 3) {
        dp[3] = Math.max(Math.max(arr[1]+arr[2], arr[1]+arr[3]), arr[2]+arr[3]);
    }
    
    for(int i = 4; i <= num; i++) {
      dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + arr[i], dp[i-3] + arr[i-1] + arr[i]));
    }
    
    bw.write(String.valueOf(dp[num]));
    bw.close();
  }
}