import java.io.*; //2755 이번학기 평점은 몇점?
import java.util.*;

public class Main {
  private static final Map<String, Double> arr = new HashMap<String, Double>(){
      {
          put("A+", 4.3); put("A0", 4.0); put("A-", 3.7);
          put("B+", 3.3); put("B0", 3.0); put("B-", 2.7);
          put("C+", 2.3); put("C0", 2.0); put("C-", 1.7);
          put("D+", 1.3); put("D0", 1.0); put("D-", 0.7);
          put("F", 0.0);
      }
  };
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    double sum = 0, std = 0;
    
    for(int i=0; i<n; i++) {
      String[] str = br.readLine().split(" ");
      double tmp = Double.parseDouble(str[1]);
      sum += (arr.get(str[2]) * tmp);
      std += tmp;
    }

    System.out.print(String.format("%.2f", sum/std));
  }
}