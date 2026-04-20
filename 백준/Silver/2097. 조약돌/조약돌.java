import java.util.*; //2097(수학) 조약돌
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()), rlt = 0;
    
    if(n < 3) rlt = 4;
    for(int i = 2; i < n; i++) {
      if(n < i * i + 1) {
        rlt = 4 * (i - 1);
        break;
      }else if(n < i * (i + 1) + 1) {
        rlt = 4 * (i - 1) + 2;
        break;
      }
    }
    
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}