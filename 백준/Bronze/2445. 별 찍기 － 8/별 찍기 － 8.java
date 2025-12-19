import java.util.*; //2445(구현) 별 찍기 - 8
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    for(int i = 1; i <= n; i++) {
      for(int j = i; j > 0; j--) sb.append("*");
      for(int j = 2 * (n - i); j > 0; j--) sb.append(" ");
      for(int j = i; j > 0; j--) sb.append("*");
      sb.append("\n");
    }

    for(int i = n - 1; i > 0; i--) {
      for(int j = i; j > 0; j--) sb.append("*");
      for(int j = 2 * (n - i); j > 0; j--) sb.append(" ");
      for(int j = i; j > 0; j--) sb.append("*");
      sb.append("\n");
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}