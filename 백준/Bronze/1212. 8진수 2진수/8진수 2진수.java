import java.util.*; //1212(수학) 8진수 2진수
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String str = br.readLine();
    

    for(int i = 0; i < str.length(); i++) {
      int t = str.charAt(i) - '0';
      
      if(t >= 4) {
        sb.append(1);
        t -= 4;
      }else sb.append(0);
      
      if(t >= 2) {
        sb.append(1);
        t -= 2;
      }else sb.append(0);
      
      if(t == 1) {
        sb.append(1);
        t--;
      }else sb.append(0);
    }

    if(str.charAt(0) == '1') sb.delete(0, 2);
    else if(str.charAt(0) == '2') sb.deleteCharAt(0);
    else if(str.charAt(0) == '3') sb.deleteCharAt(0);
    else if(str.charAt(0) == '0') sb.delete(0, 2);
    System.out.println(sb);
  }
}