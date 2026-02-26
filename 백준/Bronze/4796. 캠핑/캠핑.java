import java.io.*; //4796 캠핑
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int i = 1;
    
    while(true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
      if(a==0 && b==0 && c==0) break;
      
      sb.append("Case ").append(i++).append(": ").append(a*(c/b)+Math.min(a, c%b)).append("\n");
    }
    
    System.out.print(sb);
  }
}