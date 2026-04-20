import java.util.*; //1105(그리디) 팔
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    String stt = st.nextToken();
    String end = st.nextToken();
    int cnt = 0;
    
    if(stt.length() == end.length()) {
      for(int i = 0; i < stt.length(); i++) {
        if(stt.charAt(i) != end.charAt(i)) break;
        else if(stt.charAt(i) == '8') cnt++;
      }
    }
    System.out.print(cnt);
  }
}