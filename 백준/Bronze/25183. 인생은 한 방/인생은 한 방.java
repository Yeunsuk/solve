import java.util.*; //25183(문자열) 인생은 한 방
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()), cnt = 1;
    String str = br.readLine();
    boolean rlt = false;
    
    for(int i = 1; i < n; i++) {
      char std = str.charAt(i - 1);
      char tmp = str.charAt(i);
      
      if(tmp - std == 1 || std - tmp == 1) {
        cnt++;
        if(cnt == 5) rlt = true;
      }else cnt = 1;
    }

    bw.write(rlt ? "YES" : "NO");
    bw.close();
  }
}