import java.util.*; //3053(기하학) 택시 기하학
import java.io.*;

public class Main {
  static double Macro(String str) {
    return Double.parseDouble(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double n = Macro(br.readLine());

    bw.write(String.valueOf(n * n * Math.PI) + "\n");
    bw.write(String.valueOf(n * n * 2));
    bw.close();
  }
}