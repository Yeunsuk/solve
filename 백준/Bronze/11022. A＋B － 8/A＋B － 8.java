import java.util.*; //11022(구현) A+B - 8
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    for(int i = 1; i <= Test; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine()," ");
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      sb.append("Case #").append(i).append(": ").append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
    }

    System.out.print(sb);
  }
}