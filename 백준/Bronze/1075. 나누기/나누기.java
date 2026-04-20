import java.util.*; //1075(수학) 나누기
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Macro(br.readLine());
    int b = Macro(br.readLine());
    a -= (a % 100);
    
    while(true) {
      if(a % b == 0) break;
      a++;
    }
    
    bw.write(String.format("%02d", (a % 100)));
    bw.close();
  }
}