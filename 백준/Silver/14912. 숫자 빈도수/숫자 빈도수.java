import java.util.*; //14912(구현) 숫자 빈도수
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Macro(st.nextToken());
    int b = Macro(st.nextToken());
    int cnt = 0, i = 1;
    br.close();    
    
    for(; i < a + 1; i++) {
      int n = i;
      while(n > 0) {
        if(n % 10 == b) cnt++;  
        n /= 10;
      }
    }

    bw.write(cnt + "");
    bw.close();
  }
}