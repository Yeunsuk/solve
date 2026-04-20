import java.util.*; //25644(dp) 최대 상승
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Macro(br.readLine()), min = 1_000_000_000, rlt = 0;
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    while(Test-- > 0) {
      int tmp = Macro(st.nextToken());
      rlt = Math.max(rlt, tmp - min);
      min = Math.min(min, tmp);
    }
    
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}