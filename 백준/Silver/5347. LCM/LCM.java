import java.util.*; //5347(수학) LCM
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  public static long Cul(int a, int b) {
    if(a % b == 0) return b;
    return Cul(b, a % b);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine());
    StringTokenizer st;

    while(n-- > 0) {
      st = new StringTokenizer(br.readLine());
      int a = Macro(st.nextToken());
      int b = Macro(st.nextToken());

      bw.write((long) a * b / Cul(a, b) + "\n");
    }
    
    bw.close();
  }
}