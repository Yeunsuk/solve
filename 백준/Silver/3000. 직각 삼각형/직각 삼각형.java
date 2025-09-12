import java.util.*; // 3000(기하학) 직각 삼각형
import java.io.*;

public class Main {   
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int[] arr_x = new int[100_001];
    int[] arr_y = new int[100_001];
    int[][] arr = new int[num][2];
    long cnt = 0;
    
    for (int i = 0; i < num; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      arr[i][0] = x;
      arr[i][1] = y;
      arr_x[x]++;
      arr_y[y]++;
    }

    for (int i = 0; i < num; i++) {
      int x = arr[i][0];
      int y = arr[i][1];
      cnt += (long)(arr_x[x] - 1) * (arr_y[y] - 1);
    }
    
    bw.write(String.valueOf(cnt));
    bw.close();
  }
}