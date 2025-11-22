import java.util.*; //3182(graphs) 한동이는 공부가 하기 싫어!
import java.io.*;

public class Main {
  static int[] arr, dp;
  private static int dfs(int i, boolean std[]) {
    if(!std[arr[i]]) {
      std[arr[i]] = true;
      return dfs(arr[i], std) + 1;
    }
    return 1;
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine()), rlt = 0, idx = 0;
    arr = new int[num+1];
    dp = new int[num+1];
    
    for(int i = 1; i <= num; i++) arr[i] = Integer.parseInt(br.readLine());
    for(int i = 1; i <= num; i++) {
      boolean std[] = new boolean[num+1];
      std[i] = true;
      dp[i] = dfs(i, std);
    }
    
    for(int i = 1; i <= num; i++) {
      if(idx < dp[i]) {
        idx = dp[i];
        rlt = i;
      }
    }
    
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}