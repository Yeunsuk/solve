import java.io.*; //9699 RICE SACK
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine()), max;
    StringBuilder sb = new StringBuilder();

    for(int i=1; i<=n; i++) {
        max = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int j=0; j<5; j++) {
          int tmp = Integer.parseInt(st.nextToken());
          if(tmp>max) max=tmp;    
        }
      
      sb.append("Case #").append(i).append(": ").append(max).append('\n');
    }
      
    System.out.print(sb);
  }
}