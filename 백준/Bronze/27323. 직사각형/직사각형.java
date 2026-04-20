import java.util.*; //27323(기하학) 직사각형
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    bw.write(String.valueOf(Macro(br.readLine()) * Macro(br.readLine())));
    bw.close();
  }
}