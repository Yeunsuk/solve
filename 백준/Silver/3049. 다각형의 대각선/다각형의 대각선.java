import java.util.*; //3049(수학) 다각형의 대각선
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine());
    
    if(n == 3) bw.write("0");
    else bw.write(String.valueOf(n * (n - 1) * (n - 2) * (n - 3) / 24));
    bw.close();
  }
}