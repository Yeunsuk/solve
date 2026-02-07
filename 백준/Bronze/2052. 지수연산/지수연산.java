import java.io.*; //2052(구현) 지수연산
import java.math.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    double ans = Math.pow(0.5, n);
    
    BigDecimal bd = new BigDecimal(ans).setScale(n, RoundingMode.HALF_UP);
    System.out.print(bd.toPlainString());
  }
}