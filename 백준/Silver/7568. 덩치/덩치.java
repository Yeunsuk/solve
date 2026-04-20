import java.util.*; //7568(구현) 덩치
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[n][2];
    StringTokenizer st;

    for(int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      arr[i][0] = Integer.parseInt(st.nextToken());
      arr[i][1] = Integer.parseInt(st.nextToken());
    }

    for(int i = 0; i < n; i++) {
      int tmp = 1;
      for(int j = 0; j < n; j++) {
        if(i == j) continue;
        if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) tmp++;
      }
      bw.write(tmp + " ");
    }

    bw.close();
  }
}