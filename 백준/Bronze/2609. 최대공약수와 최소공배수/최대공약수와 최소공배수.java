import java.util.*; //2609(수학) 최대공약수와 최소공배수
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static int Cul(int a, int b) {
    if(b == 0) return a;
    return Cul(b, a % b);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Macro(st.nextToken());
    int b = Macro(st.nextToken());
    int c = Cul(a, b);

    bw.write(c + "\n" + a  * b / c);
    bw.close();
  }
}