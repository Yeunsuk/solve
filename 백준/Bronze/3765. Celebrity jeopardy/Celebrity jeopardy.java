import java.util.*; //3765(구현) Celebrity jeopardy
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String str;
    
    while ((str = br.readLine()) != null) sb.append(str).append('\n');
    bw.write(sb.toString());
    bw.close();
  }
}