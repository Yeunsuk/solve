import java.util.*; //1297(기하학) TV 크기
import java.io.*;

public class Main {
  static double Macro(String str) {
    return Double.parseDouble(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    double n = Macro(st.nextToken());
    double a = Macro(st.nextToken());
    double b = Macro(st.nextToken());

    double tmp = Math.sqrt(Math.pow(n, 2) / (Math.pow(a, 2) + Math.pow(b, 2)));
    bw.write((int)(tmp * a) + " " + (int)(tmp * b));
    bw.close();
  }
}