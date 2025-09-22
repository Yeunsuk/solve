import java.util.*; //2178(그래프) 미로 탐색
import java.io.*;

public class Main {
  private static int[] dx = {0, 0, 1, -1};
  private static int[] dy = {1, -1, 0, 0};
  private static int si_1, si_2;
  private static int[][] arr;

  private static int bfs(int x, int y) {
      boolean[][] visit = new boolean[si_1][si_2];
      Queue<int[]> q = new LinkedList<>();
      q.add(new int[]{x, y});
      visit[x][y] = true;

      while(!q.isEmpty()) {
        int[] tmp = q.poll();
        int cx = tmp[0];
        int cy = tmp[1];

        if(cx == si_1 - 1 && cy == si_2 - 1) return arr[cx][cy];
        
        for(int i = 0; i < 4; i++) {
          int nx = cx + dx[i];
          int ny = cy + dy[i];

          if(nx >= 0 && ny >= 0 && nx < si_1 && ny < si_2) {
            if(arr[nx][ny] == 1 && !visit[nx][ny]) {
              q.add(new int[]{nx, ny});
              visit[nx][ny] = true;
              arr[nx][ny] = arr[cx][cy] + 1;
            }
          }
        }
      }

      return -1;
    }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    si_1 = Integer.parseInt(st.nextToken());
    si_2 = Integer.parseInt(st.nextToken());
    arr = new int[si_1][si_2];

    for(int i = 0; i < si_1; i++) {
      String str = br.readLine();
      for(int j = 0; j < si_2; j++) arr[i][j] = str.charAt(j) - '0';
    }
    
    bw.write(String.valueOf(bfs(0, 0)));
    bw.close();
  }
}
