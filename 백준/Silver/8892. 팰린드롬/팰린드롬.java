import java.util.*; //8892(문자열) 팰린드롬 
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  static boolean Std(String str) {
    int n = str.length();
    for(int i = 0; i < (n / 2); i++) {
      if(str.charAt(i) != str.charAt(n - i - 1)) return false;
    }
    
    return true;
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Macro(br.readLine());

    while(Test-- > 0) {
      int n = Macro(br.readLine()), i;
      String[] arr = new String[n];
      boolean sgn = false;

      for (i = 0; i < n; i++) arr[i] = br.readLine();

      loop:
      for(i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
          if(i == j) continue;
          
          String tmp = arr[i].concat(arr[j]);
          if(Std(tmp)) {
            bw.write(tmp + "\n");
            sgn = true;
            break loop;
          }
        }
      }

      if(!sgn) bw.write("0\n");
    }
    
    bw.close();
  }
}