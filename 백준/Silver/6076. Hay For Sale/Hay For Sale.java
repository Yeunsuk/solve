import java.util.*; //6076(DP) Hay For Sale
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int c = Integer.parseInt(st.nextToken());
    int h = Integer.parseInt(st.nextToken());
    int[] dp = new int[c + 1];
    
    for(int i = 0; i < h; i++) {
        int tmp = Integer.parseInt(br.readLine());
        for(int j = c; j >= tmp; j--) dp[j] = Math.max(dp[j], dp[j - tmp] + tmp);
    }
    
    bw.write(String.valueOf(dp[c]));
    bw.close();
  }
}