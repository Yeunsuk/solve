import java.util.*; //26122(문자열) 가장 긴 막대 자석
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine()), cnt = 0, res = 0, rlt = 0;
    String str = br.readLine();
    char std = '0';

    for (int i = 0; i <num; i++) {
      char tmp = str.charAt(i);
      if(std != tmp) {
        rlt = Math.max(rlt, Math.min(cnt, res));
        res = cnt;
        std = tmp;
        cnt = 1;
        continue;
      }

      cnt++;
    }

    rlt = Math.max(rlt, Math.min(cnt, res));
    bw.write(String.valueOf(rlt * 2));
    bw.close();
  }
}