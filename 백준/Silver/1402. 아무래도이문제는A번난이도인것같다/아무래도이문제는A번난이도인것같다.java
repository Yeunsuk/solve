import java.util.*; //1402(수학) 아무래도이문제는A번난이도인것같다
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Macro(br.readLine());
    
    while(Test-- > 0) bw.write("yes\n");
    bw.close();
  }
}