import java.util.*; //1748(수학) 수 이어 쓰기 1
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Macro(br.readLine());
    int std = 10, cnt = 1, sum = 0;

    for(int i = 1; i < num + 1; i++) {
      if(i % std == 0) {
        std *= 10;
        cnt++;
      }
      
      sum += cnt;
    }
  
    bw.write(String.valueOf(sum));
    bw.close();
  }
}