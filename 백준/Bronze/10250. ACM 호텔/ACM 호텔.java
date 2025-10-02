import java.util.*; //10250(구현) ACM 호텔
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    while(Test-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int y = Integer.parseInt(st.nextToken());
      st.nextToken();
      int n = Integer.parseInt(st.nextToken());

      int a = n / y + 1;
      int b = n % y;
      if(b == 0) {
        b = y;
        a--;
      }
      
      String c = a < 10 ? "0" + a + "\n" : a + "\n"; 
      sb.append(b).append(c);
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}