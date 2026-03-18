import java.io.*; //2765 자전거 속도 
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int i = 1;
    
    while(true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      double a = Double.parseDouble(st.nextToken());
      double b = Double.parseDouble(st.nextToken());
      double c = Double.parseDouble(st.nextToken())/3600;
      if(b == 0) break;
      
      double n = a * 3.1415927 * b / 12 / 5280;
      sb.append(String.format("Trip #%d: %.2f %.2f%n", i, n, n/c));
      i++;
    }

    System.out.print(sb);
  }
}