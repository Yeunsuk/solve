import java.util.*; //31776(구현) 예비 소집 결과 보고서
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Macro(br.readLine()), cnt = 0;
    StringTokenizer st;
        
    while(Test-- > 0) {
      st = new StringTokenizer(br.readLine());
      int a = Macro(st.nextToken());
      int b = Macro(st.nextToken());
      int c = Macro(st.nextToken()); 

      if(a != -1) {
        if(b == -1 && c == -1) cnt++;
        else if((b != -1) && (a <= b) && (c == -1 || b <= c)) cnt++;
      }
    }

    bw.write(String.valueOf(cnt));
    bw.close();
  }
}