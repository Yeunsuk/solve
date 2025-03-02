import java.util.*; //13322(문자열) 접두사 배열
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int len = str.length();

    StringBuilder sb = new StringBuilder(len * 2);
    for(int i = 0; i < len; i++) sb.append(i).append("\n");
    bw.write(sb.toString());
    bw.close();
  }
}