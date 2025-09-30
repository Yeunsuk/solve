import java.util.*; //27866(구현) 문자와 문자열
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    
    int n = Integer.parseInt(br.readLine());
    bw.write(str.charAt(n - 1));
    bw.close();
  }
}