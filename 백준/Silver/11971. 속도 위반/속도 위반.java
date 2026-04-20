import java.util.*; //11971(구현) 속도 위반
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int std = Macro(st.nextToken());
    int num = Macro(st.nextToken());
    int[][] arr = new int[std + 1][2];
    int max = 0;

    for(int i = 1; i < std + 1; i++) {
      st = new StringTokenizer(br.readLine());
      arr[i][0] = Macro(st.nextToken()) + arr[i - 1][0];
      arr[i][1] = Macro(st.nextToken());
    }

    int tmp = 0, m, j = 1;
    for(int i = 0; i < num; i++) {
      st = new StringTokenizer(br.readLine());
      tmp += Macro(st.nextToken());
      m = Macro(st.nextToken());

      for(; j < tmp + 1; j++) {
        for(int k = 0; k < std + 1; k++) {
          if(j <= arr[k][0]) {
            max = Math.max(max, m - arr[k][1]);
            k = std;
          }
        }
      }
    }

    bw.write(String.valueOf(max));
    bw.close();
  }
}