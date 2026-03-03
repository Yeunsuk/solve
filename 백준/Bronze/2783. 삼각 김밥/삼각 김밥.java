import java.io.*; //2783 삼각 김밥
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    double n = Double.parseDouble(st.nextToken());
    double min = (1000/Double.parseDouble(st.nextToken()))*n;
    int Test = Integer.parseInt(br.readLine());
    
    while(Test-- > 0) {
      st = new StringTokenizer(br.readLine());
      double x = Double.parseDouble(st.nextToken());
      min = Math.min(min, (1000/Double.parseDouble(st.nextToken()))*x);
    }
    
    System.out.print(String.format("%.2f", min));
  }
}