import java.util.*; //4153(기하학) 직각삼각형
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int a, b, c;
    
    while(true) {
      st = new StringTokenizer(br.readLine());
      a = Macro(st.nextToken());
      b = Macro(st.nextToken());
      c = Macro(st.nextToken());

      if(a == 0 && b == 0 && c == 0) break;
      a *= a;
      b *= b;
      c *= c;

      if(a + b == c || a + c == b || b + c == a) bw.write("right\n");
      else bw.write("wrong\n");
    }
    
    bw.close();
  }
}