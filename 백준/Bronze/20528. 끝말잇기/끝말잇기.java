import java.util.*; //20528(문자열) 끝말잇기
import java.awt.Stroke;
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Macro(br.readLine()) - 1;
    boolean rlt = true;

    StringTokenizer st = new StringTokenizer(br.readLine());
    char std = st.nextToken().charAt(0);
    
    while(num-- > 0) {
      if(std != st.nextToken().charAt(0)) {
        rlt = false;
        break;
      }
    }

    bw.write(rlt ? "1" : "0");
    bw.close();
  }
}