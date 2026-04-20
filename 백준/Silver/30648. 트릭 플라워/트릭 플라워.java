import java.util.*; //30648(구) 트릭 플라워
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Macro(st.nextToken()), cnt = 0;
    int b = Macro(st.nextToken());
    int n = Macro(br.readLine());
    
    boolean[][] arr = new boolean[n + 1][n + 1];
    arr[a][b] = true;

    while(true) {
      if(a + b < n - 2) {
        a++;
        b++;
      }else {
        a /= 2;
        b /= 2;
      }

      cnt++;
      if(arr[a][b]) break;
      else arr[a][b] = true;
    }
    
    bw.write(String.valueOf(cnt));
    bw.close();
  }
}