import java.util.*; //2018(수학) 수들의 합 5
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine()), rlt = 0;
    br.close();
    
    for(int i = 1; i <= n; i++) {
      int tmp = 0;
      for(int j = i; j <= n; j++) {
        tmp += j;
        if(tmp > n) break;
        else if(tmp == n) {
          rlt++;
          break;
        }
      }
    }
    
    bw.write(rlt + "");
    bw.close();
  }
}