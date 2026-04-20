import java.util.*; //9471(수학) 피사노 주기
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Macro(br.readLine()) + 1;

    for(int i = 1; i < num; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = 1, b = 1, cnt = 0;
      st.nextToken();
      
      int n = Macro(st.nextToken());
      while(true) {
        int tmp = (a + b) % n;
        
        cnt++;
        a = b;
        b = tmp;
        if (a == 1 && b == 1) break;
      }

      bw.write(i + " " + cnt + "\n");
    }
    
    bw.close();
  }
}
