import java.util.*; //19563(수학) 개구리 1
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Math.abs(Macro(st.nextToken()));
    int b = Math.abs(Macro(st.nextToken()));
    int c = Macro(st.nextToken()) - a - b;
    
    bw.write(c < 0 ? "NO" : c % 2 == 0 ? "YES" : "NO");
    bw.close();
  }
}