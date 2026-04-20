import java.util.*; //15814(구현) 야바위 대장
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder(br.readLine());
    int Test = Macro(br.readLine());
    StringTokenizer st;

    while(Test-- > 0) {
      st = new StringTokenizer(br.readLine());
      int a = Macro(st.nextToken());
      int b = Macro(st.nextToken());
      char tmp = sb.charAt(a);
      
      sb.setCharAt(a, sb.charAt(b));
      sb.setCharAt(b, tmp);
    }

    bw.write(sb.toString());
    bw.close();
  }
}