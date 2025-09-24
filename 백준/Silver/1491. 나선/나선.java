import java.util.*; //1491(구현) 나선
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken()), a = 0, b = 0;
    int m = Integer.parseInt(st.nextToken()), d = 1, s = 2;
    boolean[][] visited = new boolean[m][n];
    visited[m - 1][0] = true;
    int x = m - 1, y = 0;
    
    while(true) {
      if(s > n * m) {
        bw.write(a + " " + b);
        break;
      }

      if(d > 4) d = 1;

      if(d == 1) {
        if(y + 1 >= n || visited[x][y + 1]) d++;
        else {
          visited[x][y + 1] = true;
          s++;
          a++;
          y++;
        }
      }else if(d == 2) {
        if(x - 1 < 0 || visited[x - 1][y]) d++;
        else {
          visited[x - 1][y] = true;
          s++;
          b++;
          x--;
        }
      }else if(d == 3) {
        if(y - 1 < 0 || visited[x][y - 1]) d++;
        else {
          visited[x][y - 1] = true;
          s++;
          a--;
          y--;
        }
      }else {
        if(x + 1 >= m || visited[x + 1][y]) d++;
        else {
          visited[x + 1][y] = true;
          s++;
          b--;
          x++;
        }
      }
    }

    bw.close();
  }
}