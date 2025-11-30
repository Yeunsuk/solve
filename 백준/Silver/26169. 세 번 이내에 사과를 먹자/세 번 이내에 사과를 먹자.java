import java.util.*; //26169(graphs) 세 번 이내에 사과를 먹자
import java.io.*;

public class Main {
  static int[][] var = {{1,0}, {0,1}, {-1,0}, {0,-1}};
  static int[][] map = new int[5][5];
  static int x, y, apple;

  static void dfs(int x, int y, int depth, boolean[][] visited) {
    if(apple >= 2 || depth == 3) return;

    for(int i = 0; i < 4; i++) {
      int dx = x + var[i][0];
      int dy = y + var[i][1];

      if(dx < 0 || dy < 0 || dx >= 5 || dy >= 5) continue;
      if(visited[dx][dy] || map[dx][dy] == -1) continue;

      depth++;
      visited[dx][dy] = true;
      if(map[dx][dy] == 1) apple++;
      dfs(dx, dy, depth, visited);

      if(apple < 2) {
        depth--;
        visited[dx][dy] = false;
        apple -= (map[dx][dy] == 1 ? 1 : 0);
      }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean[][] visited = new boolean[5][5];
    StringTokenizer st;

    for(int i = 0; i < 5; i++) {
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j < 5; j++) map[i][j] = Integer.parseInt(st.nextToken());
    }

    st = new StringTokenizer(br.readLine());
    x = Integer.parseInt(st.nextToken());
    y = Integer.parseInt(st.nextToken());
    visited[x][y] = true;

    if(map[x][y] != -1) dfs(x, y, 0, visited);
    bw.write((apple >= 2) ? "1" : "0");
    bw.close();
  }
}