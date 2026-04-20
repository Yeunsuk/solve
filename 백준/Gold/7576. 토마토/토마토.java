
import java.util.*; //7576(그래프) 토마토
import java.io.*;

public class Main {
  static int[] dx = {0, 0, 1, -1};
  static int[] dy = {1, -1, 0, 0};
  static int[][] arr;

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());
    Queue<int[]> q = new LinkedList<>();
    int cnt = 0; int time = 0;
    arr = new int[y][x];
    
    for(int i = 0; i < y; i++) { //입력
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j < x; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
        if(arr[i][j] == 1) q.add(new int[] {i, j});
        else if(arr[i][j] == 0) cnt++;
      }
    }

    while(cnt > 0 && !q.isEmpty()) {
      for(int i = q.size(); i > 0; i--) {
        int[] pnt = q.poll();

        for(int j = 0; j < 4; j++) {
          int ny = pnt[0] + dy[j];
          int nx = pnt[1] + dx[j];

          if(ny < 0 || y <= ny || nx < 0 || x <= nx) continue;
          if(arr[ny][nx] != 0) continue;
          
          q.add(new int[] {ny, nx});
          arr[ny][nx] = 1;
          cnt--;
        }
      }
      time++;
    }
    
    System.out.print(cnt == 0 ? time : -1);
  }
}