import java.util.*; //2439(구현) 별 찍기 - 2
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Macro(br.readLine());
    br.close();
    
    for(int i = 1; i <= n; i++) {
      for(int j = n; j > i; j--) sb.append(" ");
      for(int k = 0; k < i; k++) sb.append("*");
      sb.append("\n");
    }
    
    bw.write(String.valueOf(sb));
    bw.close();
  }
}