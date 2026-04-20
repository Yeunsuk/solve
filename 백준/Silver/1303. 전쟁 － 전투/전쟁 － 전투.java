import java.util.*; //1303(그래프) 전쟁 - 전투
import java.io.*;

public class Main {
  private static int[] dx = {0, 0, 1, -1};
  private static int[] dy = {1, -1, 0, 0};
  private static boolean[][] visit;
  private static int[][] arr;
  private static int x, y;
  private static int cnt;

  private static void DFS(int xx, int yy) {
    visit[xx][yy] = true;
    cnt++;

    for(int i = 0; i < 4; i++){
      int nx = xx + dx[i];
      int ny = yy + dy[i];

      if(nx >= 0 && ny >= 0 && nx < y && ny < x) {
        if(arr[nx][ny] == arr[xx][yy] && !visit[nx][ny]) {
          DFS(nx,ny);
        }
      }
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    x = Integer.parseInt(st.nextToken());
    y = Integer.parseInt(st.nextToken());
    int sum_0 = 0; int sum_1 = 0;
    visit = new boolean[y][x];
    arr = new int[y][x];

    for(int i = 0; i < y; i++) {
      String str = br.readLine();
      for(int j = 0; j < x; j++) {
        if(str.charAt(j) == 'W') arr[i][j] = 0;
        else arr[i][j] = 1;
      }
    }

    br.close();
    for(int i = 0; i < y; i++){
      for(int j = 0; j < x; j++){
        if(!visit[i][j]){
          cnt = 0;
          DFS(i, j);
          if(arr[i][j] == 0) sum_0 += cnt * cnt;
          else sum_1 += cnt * cnt;
        }
      }
    }

    System.out.print(sum_0 + " " + sum_1);
  }
} 