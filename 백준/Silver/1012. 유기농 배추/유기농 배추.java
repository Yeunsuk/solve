import java.util.*; //1012(그래프) 유기농 배추
import java.io.*;

public class Main {
  private static boolean[][] visit = new boolean[50][50];
  private static int[][] arr = new int[50][50];
  private static int[] dx = {0, 0, 1, -1};
  private static int[] dy = {1, -1, 0, 0};
  private static int m;
  private static int n;
  
  private static void DFS(int x, int y) {
      visit[x][y] = true;

      for(int i = 0; i < 4; i++){
          int nx = x + dx[i];
          int ny = y + dy[i];

          if(0 <= nx && nx < m && 0 <= ny && ny < n){
              if(arr[nx][ny] == 1 && !visit[nx][ny]){
                  DFS(nx,ny);
              }
          }
      }
  }
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    int TestCase = Integer.parseInt(br.readLine());
    while(TestCase-- > 0) {
      st = new StringTokenizer(br.readLine()," ");
      m = Integer.parseInt(st.nextToken());
      n = Integer.parseInt(st.nextToken());
      int k = Integer.parseInt(st.nextToken());

      visit = new boolean[m][n];
      arr = new int[m][n];
  
      for(int i = 0; i < k; i++) {
        st = new StringTokenizer(br.readLine()," ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        arr[x][y] = 1;
      }

      int cnt = 0;  
      for(int i = 0; i < m; i++){
          for(int j = 0; j < n; j++){
              if(arr[i][j] == 1 && !visit[i][j]){
                cnt++;
                DFS(i, j);
              }
          }
      }
  
      sb.append(cnt + "\n");
    }
    System.out.print(sb);
  }
} 
