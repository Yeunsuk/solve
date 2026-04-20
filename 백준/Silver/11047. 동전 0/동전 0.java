import java.util.*; //11047(그리디) 동전 0
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    int[] coin = new int[n];
    int cnt = 0;

    for(int i = 0; i < n; i++) coin[i] = Integer.parseInt(br.readLine());
    br.close();

    for(int i = n - 1; i >= 0; i--) {
      if(coin[i] <= k) {
        cnt += (k / coin[i]);
        k = k % coin[i];
      }
    }
    
    bw.write(String.valueOf(cnt));
    bw.close();
  }
}