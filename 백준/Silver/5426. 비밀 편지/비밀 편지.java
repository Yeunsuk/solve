import java.util.*; //5426(수학) 비밀 편지
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Macro(br.readLine());
    
    while(Test-- > 0) {
      String str = br.readLine();
      int tmp = (int) Math.sqrt(str.length());

      for(int i = tmp - 1; i >= 0; i--) for(int j = 0; j < tmp; j++) bw.write(str.charAt(j * tmp + i));
      bw.newLine();
    }
    
    bw.close();
  }
}