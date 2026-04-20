import java.util.*; //9012(자료구조) 괄호
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    while(Test-- > 0) {
      String str = br.readLine();
      int len = str.length();
      int cnt = 0;

      for(int i = 0; i < len; i++) {
        if(str.charAt(i) == '(') cnt++;
        else cnt--;

        if(cnt < 0) break;
      }
      
      if(cnt == 0) sb.append("YES\n");
      else sb.append("NO\n");
    }
    
    br.close();
    sb.deleteCharAt(sb.length() - 1);
    System.out.print(sb);
  }
}