import java.util.*; //3449(문자열) 해밍 거리
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Macro(br.readLine()), cnt;
    String str = "", arr = "";

    while(Test-- > 0) {
      arr = br.readLine();
      str = br.readLine();
      cnt = 0;

      for(int i = 0; i < arr.length(); i++) {
        if(arr.charAt(i) != str.charAt(i)) cnt++;
      }

      bw.write("Hamming distance is " + cnt + ".\n");
    }

    bw.close();
  }
}