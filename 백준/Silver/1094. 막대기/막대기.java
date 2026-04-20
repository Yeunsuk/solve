import java.util.*; //1094(수학) 막대기
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()), rlt = n;
    int len = 64, tmp = 0, cnt = 0;
    
    while(true) {
      if(n == 64) {
        cnt++;
        break;
      }

      len /= 2;
      if(len <= n) {
        tmp += len; 
        cnt++;
        
        if(rlt == tmp) break;
        n -= len;
      }
    }

    bw.write(String.valueOf(cnt));
    bw.close();
  }
}