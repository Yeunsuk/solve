import java.util.*; //14916(dp) 거스름돈
import java.io.*;

public class Main { 
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int cnt = 0;

    while(n > 0) {
      if(n % 5 == 0) {
        cnt = n / 5 + cnt;
        break;
      }

      n -= 2;
      cnt++;
    }

    if(n < 0) bw.write("-1");
    else bw.write(cnt + "");
    bw.close();
  }
}