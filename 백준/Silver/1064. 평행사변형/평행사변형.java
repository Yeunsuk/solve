import java.util.*; //1064(수학) 평행사변형
import java.io.*;

public class Main {
  static double Cul(int x1, int y1, int x2, int y2) {
    return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
  }
  
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int x1 = Macro(st.nextToken()), y1 = Macro(st.nextToken());
    int x2 = Macro(st.nextToken()), y2 = Macro(st.nextToken());
    int x3 = Macro(st.nextToken()), y3 = Macro(st.nextToken());

    if((x2 - x1) * (y3 - y1) == (x3 - x1) * (y2 - y1)) {
      bw.write("-1.0");
      bw.close();
      return;
    }

    double a = Cul(x1, y1, x2, y2), b = Cul(x3, y3, x2, y2), c = Cul(x3, y3, x1, y1);
    bw.write(String.valueOf(2 * (Math.max(a, Math.max(b, c)) - Math.min(a, Math.min(b, c)))));
    bw.close();
  }
}