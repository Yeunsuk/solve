import java.util.*; //2588(수학) 곱셈
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Macro(br.readLine());
    int b = Macro(br.readLine());
    
    bw.write(a * (b % 10) + "\n" + a * ((b % 100) / 10) + "\n");
    bw.write(a * (b / 100) + "\n" + a * b);
    bw.close();
  }
}