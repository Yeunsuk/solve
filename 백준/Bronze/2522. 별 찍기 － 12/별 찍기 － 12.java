import java.util.*; //2522(구현) 별 찍기 - 12
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= n - i; j++) sb.append(" ");
      for(int j = 1; j <= i; j++) sb.append("*");
      sb.append("\n");
    }

    for(int i = n + 1; i <= 2 * n - 1; i++) {
      for(int j = n; j < i; j++) sb.append(" ");
      for(int j = n; j > i - n; j--) sb.append("*");
      sb.append("\n");
    }

    bw.write(sb.toString());
    bw.close();
  }
}