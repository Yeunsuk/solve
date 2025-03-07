import java.util.*; //5344(수학) GCD
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  static int gcd(int a, int b) {
    int tmp, n;
    
    if(a < b) {
      tmp = a;
      a = b;
      b = tmp;
    }
    
    while(b != 0) {
      n = a % b;
      a = b;
      b = n;
    }
    return a;
  }
  

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int Test = Macro(br.readLine());
    
    while(Test-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      sb.append(gcd(Macro(st.nextToken()), Macro(st.nextToken()))).append("\n");
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}