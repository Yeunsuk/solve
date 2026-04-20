import java.util.*; //10990(구현) 별 찍기 - 15
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine());
    
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n - i - 1; j++) bw.write(' ');
      bw.write('*');
      
      for(int j = 0; j < 2 * i - 1; j++) bw.write(' ');
      if(i > 0) bw.write('*');
      bw.newLine();
    }
    
    bw.close();
  }
}