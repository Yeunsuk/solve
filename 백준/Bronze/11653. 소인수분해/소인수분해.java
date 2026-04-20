import java.util.*; //11653(수학) 소인수분해
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine());

    for(int i = 2; i <= Math.sqrt(n); i++) {
      while(n % i == 0) {
        bw.write(i + "\n");
        n /= i;
      }
    }
    
    if(n != 1) bw.write(String.valueOf(n));
    bw.close();
  }
}