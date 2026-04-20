import java.util.*; //31403(수학) $A + B - C$
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String a = br.readLine(), b = br.readLine();
    int c = Macro(br.readLine());
    
    bw.write((Macro(a) + Macro(b) - c) + "\n");
    bw.write(String.valueOf(Macro(a + b) - c));
    bw.close();
  }
}