import java.util.*; //1357(구현) 뒤집힌 덧셈
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  static int Cul(int tmp) {
    int rlt = 0;
    while (tmp > 0) {
      rlt = 10 * rlt + tmp % 10;
      tmp /= 10;
    }

    return rlt; 
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Cul(Macro(st.nextToken()));
    int b = Cul(Macro(st.nextToken()));
    
    bw.write(String.valueOf(Cul(a + b)));
    bw.close();
  }
}