import java.util.*; //1547(구현) 공
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Macro(br.readLine()), rlt = 1;

    while(Test-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Macro(st.nextToken());
      int b = Macro(st.nextToken());
      
      if(a == rlt) rlt = b;
      else if(b == rlt) rlt = a;
    }

    bw.write(String.valueOf(rlt));
    bw.close();
  }
}