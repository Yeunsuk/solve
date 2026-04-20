import java.util.*; //23080(문자열) 스키테일 암호
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine());
    String str = br.readLine();

    for(int i = 0; i < str.length(); i += n) bw.write(str.charAt(i));
    bw.close();
  }
}