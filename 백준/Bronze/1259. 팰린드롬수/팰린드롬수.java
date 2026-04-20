import java.util.*; //1259(문자열) 팰린드롬수
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String num = br.readLine();
    
    while(!num.equals("0")) {
      boolean check = true;
      
      for(int i = 0; i < num.length() / 2; i++) {
        if(num.charAt(i) != num.charAt(num.length() - 1 - i)) check = false;
      }
      
      if(check) bw.write("yes\n");
      else bw.write("no\n");
      num = br.readLine();
    }
    
    br.close();
    bw.close();
  }
}