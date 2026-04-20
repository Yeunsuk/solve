import java.util.*; //4963(그래프) 섬의 개수
import java.io.*;

public class Main {
  static int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
  static int[] dy = {1, 1, 1, 0, 0, -1, -1, -1};
  static boolean[][] visit;
  static int[][] arr;
  static int a, b;

  static void DFS(int x, int y) { //DFS
    visit[x][y] = true;

    for(int i = 0; i < 8; i++) {
      int nx = x + dx[i];
      int ny = y + dy[i];

      if(0 <= nx && nx < a) {
        if( 0 <= ny && ny < b) {
          if(arr[nx][ny] == 1 && !visit[nx][ny]) {
            DFS(nx,ny);
          }
        }
      }
    }
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    
    String str = " ";
    while(!(str = br.readLine()).equals("0 0")) {
      st = new StringTokenizer(str);
      
      b = Integer.parseInt(st.nextToken());
      a = Integer.parseInt(st.nextToken());
      visit = new boolean[a][b];
      arr = new int[a][b];
      int cnt = 0;

      for(int i = 0; i < a; i++) { //입력
        st = new StringTokenizer(br.readLine());
        for(int j = 0; j < b; j++) {
          arr[i][j] = Integer.parseInt(st.nextToken());
        }
      }
      
      for(int i = 0; i < a; i++) { //출력
        for(int j = 0; j < b; j++) {
          if(!visit[i][j] && arr[i][j] == 1) {
            DFS(i, j);
            cnt++; 
          }
        }
      }
      sb.append(cnt + "\n");
    }
    System.out.print(sb);
  }
}