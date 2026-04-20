import java.util.*; //13420(수학) 사칙연산
import java.io.*;

public class Main {
  static long Macro(String str) {
    return Long.parseLong(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    
    while(Test-- > 0) {
      char c[] = br.readLine().replaceAll(" ", "").toCharArray();
      String sum = "", a = "", b = "";
      int tmp = 0, i;
      long rlt = 0;
      char mid;
      
      for(i = 0; true; i++) {
        if(i > 0 && (c[i] == '+' || c[i] == '-' || c[i] == '*' || c[i] == '/')) {
          tmp = i + 1;
          mid = c[i];
          break;
        }else a += c[i];
      }
      
      for(i = tmp; true; i++) {
        if(c[i] == '=') {
          tmp = i + 1;
          break;
        }else b += c[i];
      }
        
      for(i = tmp; i < c.length; i++) sum += c[i];
      if(mid == '+') rlt = Macro(a) + Macro(b);
      if(mid == '-') rlt = Macro(a) - Macro(b);
      if(mid == '*') rlt = Macro(a) * Macro(b);
      if(mid == '/') rlt = Macro(a) / Macro(b);

      bw.write(rlt == Macro(sum) ? "correct" : "wrong answer");
      bw.newLine();
    }
    
    bw.close();
  }
}