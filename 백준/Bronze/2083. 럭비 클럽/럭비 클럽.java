import java.util.*; //2083(구현) 럭비 클럽
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    
    while(true) {
      st = new StringTokenizer(br.readLine());
      String na = st.nextToken();
      int yr = Macro(st.nextToken());
      int kg = Macro(st.nextToken());

      if(na.equals("#") && yr == 0 && kg == 0) break;
      if(yr > 17 || kg >= 80) bw.write(na + " Senior\n");
      else bw.write(na + " Junior\n");
    }
    
    bw.flush();
  }
}