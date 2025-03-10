import java.util.*; //17253(수학) 삼삼한 수 2
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Long num = Long.parseLong(br.readLine());
    if(num == 0) {
      bw.write("NO");
      bw.close();
      return;
    }
    
    while(num > 0) {
      if(num % 3 == 2) {
        bw.write("NO");
        bw.close();
        return;
      }
      
      num /= 3;
    }

    bw.write("YES");
    bw.close();
  }
}