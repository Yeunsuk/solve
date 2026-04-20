import java.util.*; //2774(구현) 아름다운 수
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()), cnt;
    
    while(n-- > 0) {
      String str = br.readLine();
      cnt = 0;
      
      for(int i = 0; i < 10; i++) {
        if(str.contains(String.valueOf(i))) {
          str.replaceAll(String.valueOf(i), "");
          cnt++;
        }
      }

      bw.write(cnt + "\n");
    }
    
    bw.close();
  }
}