import java.util.*; //1809(구현) Moo
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine());
    br.close();

    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= i; j++) bw.write("*");
      bw.write("\n");
    }
    
    bw.close();
  }
}