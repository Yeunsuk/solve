import java.util.*; //1331(구현) 나이트 투어
import java.io.*;

public class Main {
  public static boolean bool(String str1, String str2) {
    int a = Math.abs(str1.charAt(0) - str2.charAt(0));
    int b = Math.abs(str1.charAt(1) - str2.charAt(1));
    return (a == 1 && b == 2) || (a == 2 && b == 1);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Set<String> set = new HashSet<>();
    String str = br.readLine();
    String end = str;
    
    boolean std = true;
    set.add(str);
    
    for(int i = 0; i < 35; i++) {
      String tmp = br.readLine();
      if(set.contains(tmp)) {
        std = false;
        break;
      }
      else set.add(tmp);
      
      if(bool(str, tmp)) str = tmp;
      else {
        std = false;
        break;
      }
    }

    if(!bool(end, str)) std = false;
    bw.write(std ? "Valid" : "Invalid");
    bw.close();
  }
}