import java.util.*; //5555(문자열) 반지
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine(), tmp;
    int n = Macro(br.readLine());
    int cnt = 0;
    
    for(int i = 0; i < n; i++) {
      tmp = br.readLine();
      tmp += tmp;

      if(tmp.contains(str)) cnt++;
    }
    
    bw.write(String.valueOf(cnt));
    bw.close(); 
  }
}