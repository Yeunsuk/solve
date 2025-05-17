import java.util.*; //26122(문자열) 가장 긴 막대 자석
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine()), cnt_a = 1, cnt_b = 0, rlt = 0;
    String str = br.readLine();
    char ch = str.charAt(0);
    boolean std = false;

    for(int i = 1; i < num; i++) {
      if(str.charAt(i) == ch) {
        if(!std) cnt_a++;
        else cnt_b++;
      }else {
        ch = str.charAt(i);
        std = !std;

        if(cnt_b == 0) cnt_b = 1;
        else {
          rlt = Math.max(rlt, 2 * Math.min(cnt_a, cnt_b));
          cnt_a = cnt_b;
          cnt_b = 1;
          std = !std;
        }
      }
    }
    
    bw.write(String.valueOf(Math.max(rlt, 2 * Math.min(cnt_a, cnt_b))));
    bw.close();
  }
}