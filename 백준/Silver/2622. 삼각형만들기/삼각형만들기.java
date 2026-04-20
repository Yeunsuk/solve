import java.util.*; //2622(구현) 삼각형만들기
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()), cnt = 0;
    
    for(int i = 1; 0 < n - i; i++) {
      for(int j = i; j <= n - i - j; j++) {
        if(i + j > n - i - j) cnt++;
      }
    }
    
    bw.write(String.valueOf(cnt));
    bw.flush();
  }
}