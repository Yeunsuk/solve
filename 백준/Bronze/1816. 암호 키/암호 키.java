import java.util.*; //1816(수학) 암호 키
import java.io.*;

public class Main { 
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    long[] arr = new long[num];
    
    for(int i = 0; i < num; i++) arr[i] = Long.parseLong(br.readLine());
    double max = 1_000_000D;

    for(int i = 0; i < num; i++) {
      boolean std = false;
      long tmp = arr[i];
      
      for(long j = 2L; j <= max; j++) {
        if(tmp % j == 0) {
          std = true;
          break;
        }
      }
      
      sb.append(std ? "NO" : "YES").append('\n');
    }

    bw.write(sb.toString());
    bw.close();
  }
}