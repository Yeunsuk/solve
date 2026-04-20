import java.util.*; //2742(구현) 기찍 N
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int num = Integer.parseInt(br.readLine());
    br.close();

    for(int i = num; i > 0; i--) {
      sb.append(i).append("\n");
    }
    
    sb.deleteCharAt(sb.length() - 1);
    System.out.print(sb);
  }
}