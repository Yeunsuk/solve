import java.util.*; //6186(graphs) Best Grass
import java.io.*;

public class Main {
  static int[] dy = {-1, 1, 0, 0};
  static int[] dx = {0, 0, -1, 1};
  static boolean[][] arr;
  static boolean[][] std;
  static int y, x;
  
  static void dfs(int i, int j) {
    std[i][j] = true;
    
    for(int d = 0; d < 4; d++) {
      int ny = i + dy[d], nx = j + dx[d];
      
      if(ny < 0 || nx < 0 || ny >= y || nx >= x) continue;
      if(arr[ny][nx] && !std[ny][nx]) dfs(ny, nx);
    }
  }

  static int stoi(String s) { return Integer.parseInt(s); }
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    y = stoi(st.nextToken()); x = stoi(st.nextToken());
    std = new boolean[y][x];
    arr = new boolean[y][x];
    int cnt = 0;
    
    for(int i = 0; i < y; i++) {
      String str = br.readLine();
      for(int j = 0; j < x; j++) if(str.charAt(j) == '#') arr[i][j] = true;
    }

    for(int i = 0; i < y; i++) {
      for(int j = 0; j < x; j++) {
        if(arr[i][j] && !std[i][j]) {
          dfs(i, j);    
          cnt++;
        }
      }
    }
    
    bw.write(String.valueOf(cnt)); 
    bw.close();
  }
}