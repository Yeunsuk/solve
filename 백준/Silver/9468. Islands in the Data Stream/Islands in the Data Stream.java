import java.util.*; //9468(구현) Islands in the Data Stream
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
      StringTokenizer st = new StringTokenizer(br.readLine());
      int num = Macro(st.nextToken());
      int cnt = 0, std = 0;
      
      for(int i = 0; i < 15; i++) {
        int tmp = Macro(st.nextToken());
        if(std > tmp) cnt++;
        std = tmp;
      }

      bw.write(num + " " + cnt + "\n");
    }
    
    bw.close();
  }
}