import java.util.*; //15786(그리디) Send me the money
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    int num = Integer.parseInt(st.nextToken());
    int ber = Integer.parseInt(st.nextToken());
    String std = br.readLine();
    
    for(int i = 0; i < ber; i++) {
      String str = br.readLine();
      boolean rlt = false;
      int idx = 0;

      for(int j = 0; j < str.length(); j++) {
        if(str.charAt(j) == std.charAt(idx)) idx++;
        if(idx == num) {
          rlt = true;
          break;
        }
      }
        
      sb.append(rlt ? "true" : "false").append('\n');
     }
    
    bw.write(sb.toString());
    bw.close();
  }
}