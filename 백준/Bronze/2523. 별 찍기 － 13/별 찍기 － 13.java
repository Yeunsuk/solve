import java.util.*; //2523(구현) 별 찍기 - 13
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    for(int i = 1; i <= n; i++) {
      for(int j = 0; j < i; j++) sb.append("*");
      sb.append("\n");
    }

    for(int i = n - 1; i > 0; i--) {
      for(int j = 0; j < i; j++) sb.append("*");
      sb.append("\n");
    }

    System.out.print(sb.toString());
  }
}