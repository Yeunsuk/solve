import java.util.*; //2441(구현) 별 찍기 - 4
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int num = Macro(br.readLine());
    
    for(int i = 0; i < num; i++) {
      for(int j = 0; j < i; j++) sb.append(" ");
      for(int j = 0; j < num - i; j++) sb.append("*");
      sb.append("\n");
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}