import java.util.*; //2442(구현) 별 찍기 -5
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int num = Integer.parseInt(br.readLine());
    br.close();
    
    for(int i = 1; i <= num; i++) {
      for(int j = 1; j <= num - i; j++) sb.append(" ");
      for(int j = 1; j <= 2 * i - 1; j++) sb.append("*");
      sb.append("\n");
    }
    
    sb.delete(sb.length() - 1, sb.length());
    bw.write(String.valueOf(sb));
    bw.close();
  }
}