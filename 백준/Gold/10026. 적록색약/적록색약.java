import java.util.*; //10026(그래프) 적록색약
import java.io.*;

public class Main {
  private static boolean[][] visit = new boolean[100][100];
  private static char[][] arr = new char[100][100];
  private static int[] dx = {0, 0, 1, -1};
  private static int[] dy = {1, -1, 0, 0};
  private static char[] color = {'R', 'G', 'B'};
  private static int num;
  private static int cnt;
  

  private static void Macro(char color) {
    for(int i = 0; i < num; i++){
      for(int j = 0; j < num; j++){
        if(arr[i][j] == color && !visit[i][j]){
          cnt++;
          DFS(i, j, color);
        }
      }
    }
  }
  
  private static void DFS(int x, int y, char color) {
      visit[x][y] = true;

      for(int i = 0; i < 4; i++){
          int nx = x + dx[i];
          int ny = y + dy[i];

          if(nx >= 0 && ny >= 0 && nx < num && ny < num){
              if(arr[nx][ny] == color && !visit[nx][ny]){
                  DFS(nx,ny, color);
              }
          }
      }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    num = Integer.parseInt(br.readLine());
    visit = new boolean[num][num];
    arr = new char[num][num];
    cnt = 0;

    for(int i = 0; i < num; i++) {
      String str = br.readLine();
      for(int j = 0; j < num; j++) {
        arr[i][j] = str.charAt(j);
      }
    }

    br.close();
    for(int i = 0; i < 3; i++) {
      Macro(color[i]);
    }

    visit = new boolean[num][num];
    sb.append(cnt + " ");
    cnt = 0;
    
    for(int i = 0; i < num; i++) {
      for(int j = 0; j < num; j++) {
        if(arr[i][j] == 'R') arr[i][j] = 'G';
      }
    }

    for(int i = 1; i < 3; i++) {
      Macro(color[i]);
    }
    
    sb.append(cnt);
    System.out.print(sb);
  }
}