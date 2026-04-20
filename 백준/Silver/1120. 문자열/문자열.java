import java.util.*; //1120번(string) 문자열
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int min = 50;
    int cnt = 0;
    
    st = new StringTokenizer(br.readLine());
    String a = st.nextToken();
    String b = st.nextToken();
    br.close();

    for(int i = 0; i < b.length() - a.length() + 1; i++) {
      for(int j = 0; j < a.length(); j++) {
        if(a.charAt(j) != b.charAt(i + j)) cnt++;
        else continue;
      }
      min = Math.min(min, cnt);
      cnt = 0;
    }
 
    System.out.print(min);
  }
}