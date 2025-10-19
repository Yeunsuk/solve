import java.util.*; //2738(구현) 행렬 덧셈
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int y = Integer.parseInt(st.nextToken());
    int x = Integer.parseInt(st.nextToken());
    StringBuilder sb = new StringBuilder();
    int[][] arr = new int[y][x];

    for(int i = 0; i < y; i++) {
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j < x; j++) arr[i][j] = Integer.parseInt(st.nextToken());
    }

    for(int i = 0; i < y; i++) {
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j < x; j++) sb.append(arr[i][j] + Integer.parseInt(st.nextToken())).append(" ");
      sb.append("\n");
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}