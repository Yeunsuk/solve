import java.util.*; //16486(기하학) 운동장 한 바퀴
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    bw.write(String.valueOf((2 * Macro(br.readLine())) + (2 * 3.141592 * Macro(br.readLine()))));
    bw.close();
  }
}