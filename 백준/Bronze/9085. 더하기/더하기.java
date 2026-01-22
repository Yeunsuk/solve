import java.util.*; //9085(구현) 더하기
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    while(Test-- > 0) {
      int n = Integer.parseInt(br.readLine()), sum = 0;
      StringTokenizer st = new StringTokenizer(br.readLine());
      while(st.hasMoreTokens()) sum += Integer.parseInt(st.nextToken()); 
      sb.append(sum).append("\n");
    }
    
    System.out.print(sb);
  }
}