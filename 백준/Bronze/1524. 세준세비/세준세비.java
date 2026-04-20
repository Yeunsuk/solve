import java.util.*; //1524(구현) 세준세비
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Macro(br.readLine());

    while(Test-- > 0) {
      br.readLine();
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Macro(st.nextToken()), max_a = 0;
      int b = Macro(st.nextToken()), max_b = 0;

      st = new StringTokenizer(br.readLine());
      for(int i = 0; i < a; i++) {
        int tmp = Macro(st.nextToken());
        if(max_a < tmp) max_a = tmp;
      }

      st = new StringTokenizer(br.readLine());
      for(int i = 0; i < b; i++) {
        int tmp = Macro(st.nextToken());
        if(max_b < tmp) max_b = tmp;
      }
      
      bw.write(max_a >= max_b ? "S\n" : "B\n");
    }
    
    bw.close();
  }
}