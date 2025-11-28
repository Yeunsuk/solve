import java.util.*; //17204(graphs) 죽음의 게임
import java.io.*;

public class Main {
  static int stoi(String s) { return Integer.parseInt(s); }
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = stoi(st.nextToken()), k = stoi(st.nextToken());
    int[] arr = new int[n];
    int cnt = 0, idx = 0;
    boolean flag = false;

    for(int i = 0; i < n; i++) arr[i] = stoi(br.readLine());
    for(int i = 0; i < n; i++) {
      if(idx == k) {
        flag = true;
        break;
      }
      idx = arr[idx];
      cnt++;
    }
    
    bw.write(flag ? String.valueOf(cnt) : "-1");
    bw.close();
  }
}