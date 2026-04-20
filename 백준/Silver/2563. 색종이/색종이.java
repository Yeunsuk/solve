import java.util.*; //2563(구현) 색종이
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int cnt = Integer.parseInt(br.readLine());
    boolean[][] visit = new boolean[100][100];
    int x = 0, y = 0, rlt = 0;
    StringTokenizer st;
  
    for(int i = 0; i < cnt; i++) {
      st = new StringTokenizer(br.readLine());
      x = Integer.parseInt(st.nextToken());
      y = Integer.parseInt(st.nextToken());
      for(int j = x; j < x + 10; j++) {
        for(int k = y; k < y + 10; k++) {
          if (!visit[j][k]) {
            visit[j][k] = true;
            rlt++;
          }
        }
      }
    }
    
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}