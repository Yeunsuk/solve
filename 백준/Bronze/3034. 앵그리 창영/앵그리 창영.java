import java.util.*; //3034(기하학) 앵그리 창영
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num = Macro(st.nextToken());
    int x = Macro(st.nextToken());
    int y = Macro(st.nextToken());
    x *= x;
    y *= y;

    x = (int)Math.sqrt(x + y);
    while(num-- > 0) {
        int tmp = Macro(br.readLine());
        if(tmp > x) bw.write("NE\n");
        else bw.write("DA\n");
    }
    
    bw.close();
  }
}