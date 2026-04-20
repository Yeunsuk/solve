import java.util.*; //1526(수학) 가장 큰 금민수
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    
    while(true) {
      boolean tmp = true;
      for(int i = 0; i < str.length(); i++) {
        if(str.charAt(i) != '4' && str.charAt(i) != '7') {
          tmp = false;
          break;
        }
      }
      
      if(tmp == false) str = String.valueOf(Macro(str) - 1);
      else break;
    }
    
    bw.write(str);
    bw.close();
  }
}