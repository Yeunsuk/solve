import java.util.*; //21955(문자열) Split
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String str = br.readLine();
    int len = str.length() / 2;
    sb.append(str, 0, len);
    sb.append(' ');
    
    sb.append(str, len, str.length());
    bw.write(sb.toString());
    bw.close();
  }
}