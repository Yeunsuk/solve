import java.util.*; //2468(그래프) 안전 영역
import java.io.*;

public class Main {
  static int[] dx = {0, 0, 1, -1};
  static int[] dy = {1, -1, 0, 0};
  static boolean[][] visit;
  static int[][] arr;
  static int n;

  static int DFS(int x, int y, int height) { //DFS
    visit[x][y] = true;

    for(int i = 0; i < 4; i++) {
      int nx = x + dx[i];
      int ny = y + dy[i];

      if(nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
      if(arr[nx][ny] <= height) continue;
      if(visit[nx][ny]) continue;
      DFS(nx, ny, height);
    }
    return 1;
  }
  
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    arr = new int[n][n];

    int max_H = 0;
    for(int i = 0; i < n; i++) { //입력
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j = 0; j < n; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
        if(arr[i][j] > max_H) {
          max_H = arr[i][j];
        }
      }
    }

    int max = 0;
    for(int height = 0; height <= max_H; height++) { //출력
      visit = new boolean[n][n];
      int cnt = 0;
      
      for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
          if(!visit[i][j] && arr[i][j] > height){
            cnt += DFS(i, j, height);
          }
        }
      }
      max = Math.max(max, cnt);
    }
    System.out.print(max);
  }
}