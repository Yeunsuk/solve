import java.io.*; //2729 이진수 덧셈
import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    while(Test-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      BigInteger b1 = new BigInteger(st.nextToken(), 2);
      BigInteger b2 = new BigInteger(st.nextToken(), 2);
      sb.append(b1.add(b2).toString(2)).append("\n");
    }
    
    System.out.print(sb);
  }
}