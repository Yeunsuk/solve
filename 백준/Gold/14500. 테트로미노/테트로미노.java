import java.util.*; //14500(구현) 테트로미노
import java.io.*;

public class Main {
  static int y, x, max = Integer.MIN_VALUE;
  static int[] dy = {-1,1,0,0};
  static int[] dx = {0,0,-1,1};
  static boolean[][] visit;
  static int[][] arr;


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    y = Integer.parseInt(st.nextToken());
    x = Integer.parseInt(st.nextToken());
    visit = new boolean[y][x];
    arr = new int[y][x];

    for(int i = 0; i < y; i++) { //입력
      st = new StringTokenizer(br.readLine(), " ");
      for(int j = 0; j < x; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    br.close();
    for(int i = 0; i < y; i++) {
      for(int j = 0; j < x; j++) {
        visit[i][j] = true;
        DFS(i, j, 1, arr[i][j]);
        visit[i][j] = false;

        COBI(0, 0, i, j, arr[i][j]);
      }
    }

    System.out.print(max);
  }

  private static void COBI(int cnt, int start, int yy, int xx, int sum) {
    if(cnt == 3) {
      if(max < sum) max = Math.max(max, sum);
      return;
    }

    for (int i = start; i < 4; i++) {
      int ny = yy + dy[i];
      int nx = xx + dx[i];

      if(ny < 0 || ny >= y || nx < 0 || nx >= x) continue;

      COBI(cnt + 1, i + 1, yy, xx, sum + arr[ny][nx]);
    }
  }


  static void DFS(int yy, int xx, int cnt, int sum) {

    if(cnt == 4) {
      if(max < sum) max = Math.max(max, sum);
      return;
    }

    for (int i = 0; i < 4; i++) {
      int ny = yy + dy[i];
      int nx = xx + dx[i];

      if(ny < 0 || ny >= y || nx < 0 || nx >= x) continue;
      if(visit[ny][nx]) continue;

      visit[ny][nx] = true;
      DFS(ny, nx, cnt + 1, sum + arr[ny][nx]);
      visit[ny][nx] = false;
    }
  }
}