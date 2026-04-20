import java.util.*; //2440(구현) 별 찍기 - 3
import java.io.*;

public class Main {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    br.close();

    for(int i = n; i > 0; i--)  {
      for(int j = 0; j < i; j++) sb.append("*");
      sb.append("\n");
    }

    System.out.print(sb);
  }
}