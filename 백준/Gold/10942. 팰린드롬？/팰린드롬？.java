import java.util.*; //10942(dp) 팰린드롬?
import java.io.*;

public class Main {
  static boolean[][] dp;
  static int stoi(String s) { return Integer.parseInt(s); }
  
  static void Macro(int[] arr, int n) {
    for(int i = 1; i <= n; i++) {
      if(i < n && arr[i] == arr[i + 1]) dp[i][i + 1] = true;
      dp[i][i] = true;
    }

    for(int i = 2; i < n; i++) {
      for(int j = 1; j <= n - i; j++)
        if(arr[j] == arr[j+i] && dp[j+1][j+i-1]) dp[j][j+i] = true;
    }
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = stoi(br.readLine());
    
    int arr[] = new int[n+1];
    dp = new boolean[n+1][n+1];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 1; i <= n; i++) arr[i] = stoi(st.nextToken());

    Macro(arr, n);
    int Test = stoi(br.readLine());
    for(int i = 0; i < Test; i++) {
      st = new StringTokenizer(br.readLine());
      sb.append(dp[stoi(st.nextToken())][stoi(st.nextToken())] ? "1\n" : "0\n");
    }
    
    bw.write(sb.toString()); 
    bw.close();
  }
}