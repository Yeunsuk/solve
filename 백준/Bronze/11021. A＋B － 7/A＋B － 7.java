import java.util.*; //11021(구현) A+B - 7
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    for(int i = 1; i <= T; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      sb.append("Case #").append(i).append(": ").append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())).append("\n");
    }

    System.out.print(sb);
  }
}