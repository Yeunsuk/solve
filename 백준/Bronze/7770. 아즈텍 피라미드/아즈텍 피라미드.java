import java.util.*; //7770(수학) 아즈텍 피라미드
import java.io.*;

public class Main { 
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int sum = 1, rlt = 0;
    
    for(int i = 0; i < 1_000_000_000; i++) {
      sum += 4 * i;
      rlt += sum;

      if(rlt > num) {
        bw.write(String.valueOf(i));
        break;
      }
    }
    
    bw.close();
  }
}