import java.util.*; //1837(구현) 암호제작
import java.math.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    BigInteger p = new BigInteger(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    for(int i = 2; i < k; i++) {
      if(isPrime(i)) {
        if(p.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
          System.out.print("BAD " + i);
          return;
        }
      }
    }

    System.out.print("GOOD");
  }

  public static boolean isPrime(int n) {
    if(n == 2) return true;
    if(n%2 == 0) return false;

    for(int i = 3; i*i <= n; i += 2) if (n % i == 0) return false;
    return true;
  }
}