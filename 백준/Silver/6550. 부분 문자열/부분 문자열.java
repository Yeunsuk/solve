import java.util.*; //6550(문자열) 부분 문자열
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    while(true) {
      String str = br.readLine();
      if(str == null) break;

      st = new StringTokenizer(str);
      String std = st.nextToken();
      String tmp = st.nextToken();
      int len = std.length();
      int cnt = 0;

      for(int i = 0; i < tmp.length(); i++) {
        if(std.charAt(cnt) == tmp.charAt(i)) cnt++;
        if(cnt == len) break;
      }

      if(cnt == len) bw.write("Yes\n");
      else bw.write("No\n");
    }

    bw.close();
  }
}