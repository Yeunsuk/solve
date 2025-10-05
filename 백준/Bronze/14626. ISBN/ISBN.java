import java.util.*; //14626(구현) ISBN
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    boolean pos = false;
    
    int std = str.charAt(12) - '0', sum = 0, rlt;
    for(int i = 0; i < 12; i++) {
      if(str.charAt(i) == '*') {
        if(i % 2 == 1) pos = true;
        continue;
      }
      
      int tmp = str.charAt(i) - '0';
      sum += i % 2 == 1 ? tmp * 3 : tmp;
    }
    
    for(int i = 0; i < 10; i++) {
      int tmp = sum + (pos ? i * 3 : i);
      if((tmp + std) % 10 == 0) {
        bw.write(String.valueOf(i));
        break;
      }
    }
    
    bw.close();
  }
}