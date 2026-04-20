import java.util.*; //2667(그래프) 단지번호붙이기
import java.io.*;

public class Main {
  private static boolean[][] visit = new boolean[25][25];
  private static int[][] arr = new int[25][25];
  private static int[] dx = {0, 0, 1, -1};
  private static int[] dy = {1, -1, 0, 0};
  private static int num;
  private static int cnt;
  
  private static void DFS(int x, int y) {
      visit[x][y] = true;
      cnt++;

      for(int i = 0; i < 4; i++){
          int nx = x + dx[i];
          int ny = y + dy[i];

          if(nx >= 0 && ny >= 0 && nx < num && ny < num){
              if(arr[nx][ny] == 1 && !visit[nx][ny]){
                  DFS(nx,ny);
              }
          }
      }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    num = Integer.parseInt(br.readLine());
    visit = new boolean[num][num];
    arr = new int[num][num];

    for(int i = 0; i < num; i++) {
      String str = br.readLine();
      for(int j = 0; j < str.length(); j++) {
        arr[i][j] = (int)str.charAt(j) - '0';
      }
    }
    
    br.close();
    List<Integer> result = new ArrayList<Integer>();

    for(int i = 0; i < num; i++){
        for(int j = 0; j < num; j++){
            if(arr[i][j] == 1 && !visit[i][j]){
              cnt = 0;
              DFS(i, j);
              result.add(cnt);
            }
        }
    }

    sb.append(result.size() + "\n");
    Collections.sort(result);
    
    for(int i = 0; i < result.size(); i++) {
      sb.append(result.get(i) + "\n");
    }
    
    System.out.print(sb);
  }
} 