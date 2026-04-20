import java.util.*; //2231(브루트포스) 분해합
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()), rlt = 0;
    
    for(int i = 0; i < n; i++) {
      int tmp = i, sum = 0;
      while(tmp != 0) {
        sum += tmp % 10;
        tmp /= 10;
      }

      if(sum + i == n) {
        rlt = i;
        break;
      }
    }

    bw.write(String.valueOf(rlt));
    bw.close();
  }
}