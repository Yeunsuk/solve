import java.util.*; //14490(문자열) 백대열
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  static int Cul(int a, int b) {
    if(a % b == 0) return b;
    return Cul(b, a % b);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] arr = br.readLine().split(":");
    int n = Macro(arr[0]);
    int m = Macro(arr[1]);

    int tmp = Cul(Math.max(n, m), Math.min(n, m));
    bw.write(n / tmp + ":" + m / tmp);
    bw.close();
  }
}