import java.util.*; //2804(문자열) 크로스워드 만들기
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    String str_a = st.nextToken();
    String str_b = st.nextToken();
    
    int len_a = str_a.length(), len_b = str_b.length(), a = 0, b = 0;
    
    for(a = 0; a < len_a; a++) {
      if((b = str_b.indexOf(str_a.charAt(a))) >= 0) break;
    }

    for(int i = 0; i < len_b; i++) {
      if(i == b) {
        sb.append(str_a).append("\n");
        continue;
      }
      
      for(int j = 0; j < len_a; j++) {
        if(j == a) sb.append(str_b.charAt(i));
        else sb.append(".");
      }
      
      sb.append("\n");
     }
    
    bw.write(sb.toString());
    bw.close();
  }
}
