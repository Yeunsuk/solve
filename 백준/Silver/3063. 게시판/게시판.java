import java.util.*; //3063(수학) 게시판
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int Test = Macro(br.readLine());
    
    while(Test-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int x1 = Macro(st.nextToken());
      int y1 = Macro(st.nextToken());
      int x2 = Macro(st.nextToken());
      int y2 = Macro(st.nextToken());
      int x3 = Macro(st.nextToken());
      int y3 = Macro(st.nextToken());
      int x4 = Macro(st.nextToken());
      int y4 = Macro(st.nextToken());
      int s = (x2 - x1) * (y2 - y1);
      
      int h = (Math.min(x2, x4) - Math.max(x1, x3));
      int w = (Math.min(y2, y4) - Math.max(y1, y3));
      if(h > 0 && w > 0) s -= h * w;
      sb.append(s).append('\n');
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}
