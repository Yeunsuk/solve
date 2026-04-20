import java.util.*; //17247(수학) 택시 거리
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int y = Macro(st.nextToken()), y1 = -1, y2 = -1;
    int x = Macro(st.nextToken()), x1 = -1, x2 = -1;

    for(int i = 0; i < y; i++) {
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j < x; j++) {
        if(Macro(st.nextToken()) == 1) {
          if(y1 == -1) {
            y1 = i;
            x1 = j;
          }else {
            y2 = i;
            x2 = j;
            bw.write(String.valueOf(Math.abs(y1 - y2) + Math.abs(x1 - x2)));
            bw.close();
            return;
          }
        }
      }
    }
  }
}
