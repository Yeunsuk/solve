import java.io.*; //8437 Julka
import java.math.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BigInteger a = new BigInteger(br.readLine());
    BigInteger b = new BigInteger(br.readLine());
    BigInteger t = BigInteger.valueOf(2);
    System.out.print(a.add(b).divide(t)+"\n"+a.subtract(b).divide(t));
  }
}