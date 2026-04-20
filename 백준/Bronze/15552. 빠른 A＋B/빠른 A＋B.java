import java.util.*; //15552(구현) 빠른 A+B
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    int Test = Integer.parseInt(br.readLine());
    for(int i = 0; i < Test; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      sb.append(a + b).append("\n");
    }
    br.close();
    sb.deleteCharAt(sb.length() - 1);
    System.out.print(sb);
  }
}