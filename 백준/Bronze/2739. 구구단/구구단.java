import java.util.*; //2739(구현) 구구단
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    br.close();
    

    for(int i = 1; i < 10; i++) {
      sb.append(n).append(" * ").append(i).append(" = ").append(n * i).append("\n");
    }
    sb.deleteCharAt(sb.length() - 1);
    System.out.print(sb);
  }
}