import java.util.*; //1049(그리디) 기타줄
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Macro(st.nextToken()), set = 1000, rlt;
    int b = Macro(st.nextToken()), one = 1000;

    for(int i = 0; i < b; i++) {
      st = new StringTokenizer(br.readLine());
      set = Math.min(set, Macro(st.nextToken()));
      one = Math.min(one, Macro(st.nextToken()));
    }

    if(n % 6 == 0) rlt = set * (n / 6);
    else rlt = set * ((n / 6) + 1);

    rlt = Math.min(rlt, (set * (n / 6)) + (one * (n % 6)));
    bw.write(String.valueOf(Math.min(rlt, one * n)));
    bw.close();
  }
}