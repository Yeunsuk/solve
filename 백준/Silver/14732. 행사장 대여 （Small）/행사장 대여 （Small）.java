import java.util.*; //14732(구현) 행사장 대여 (Small)
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine()), cnt = 0;
    boolean[][] arr = new boolean[501][501];
    
    while(Test-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int x1 = Integer.parseInt(st.nextToken());
      int y1 = Integer.parseInt(st.nextToken());
      int x2 = Integer.parseInt(st.nextToken());
      int y2 = Integer.parseInt(st.nextToken());

      for(int i = y1; i < y2; i++) {
        for(int j = x1; j < x2; j++) {
          if(!arr[i][j]) {
            arr[i][j] = true;
            cnt++;
          }
        }
      }
    }

    bw.write(String.valueOf(cnt));
    bw.close();
  }
}