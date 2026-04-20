import java.util.*; //16944(문자열) 강력한 비밀번호
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Set<Character> set = Set.of('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+');
    int num = Integer.parseInt(br.readLine()), cnt = 4;
    boolean[] arr = new boolean[4];
    String str = br.readLine();
    int len = str.length();
    
    for(int i = 0; i < num; i++) {
      char tmp = str.charAt(i);
      if(!arr[0] && Character.isLowerCase(tmp)) arr[0] = true;
      if(!arr[1] && Character.isUpperCase(tmp)) arr[1] = true;
      if(!arr[2] && Character.isDigit(tmp)) arr[2] = true;
      if(!arr[3] && set.contains(tmp)) arr[3] = true;
    }

    for(int i = 0; i < 4; i++) if(arr[i]) cnt--;
    bw.write(String.valueOf(len + cnt >= 6 ? cnt : 6 - len));
    bw.close();
  }
}