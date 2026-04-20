import java.util.*; //11008(구현) 복붙의 달인
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Macro(br.readLine());
    StringTokenizer st;

    while(Test-- > 0) {
      st = new StringTokenizer(br.readLine());
      String str = st.nextToken();
      String cc = st.nextToken();
      int rlt = str.length();
      int cnt = 0;
  
      for(int i = 0; i < str.length() - cc.length() + 1; i++) {
        if(str.charAt(i) == cc.charAt(0)) {
          if(cc.equals(str.substring(i, i + cc.length()))) {
            i += cc.length() - 1;
            cnt++;
          }
        }
      }

      bw.write(String.valueOf(rlt - (cnt * (cc.length() - 1))));
      bw.newLine();
    }

    bw.close();
  }
}