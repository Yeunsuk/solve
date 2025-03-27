import java.util.*; //30792(구현) gahui and sousenkyo 2
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Macro(br.readLine()), cnt = 1;
    int my = Macro(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    while(--num > 0) if(Macro(st.nextToken()) > my) cnt++;
    bw.write(String.valueOf(cnt));
    bw.close();
  }
}