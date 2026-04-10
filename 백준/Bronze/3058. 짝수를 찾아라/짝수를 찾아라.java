import java.io.*; //3058 짝수를 찾아라
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    while(Test-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int min = 100, sum = 0;
      
      for(int j=0; j<7; j++) {
        int n = Integer.parseInt(st.nextToken());
        if(n%2 == 0) {
          min = Math.min(min, n);
          sum += n;
        }
      }
      
      sb.append(sum).append(" ").append(min).append("\n");
    }

    System.out.println(sb);
  }
}