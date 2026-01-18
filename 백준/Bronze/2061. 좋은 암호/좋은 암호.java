import java.util.*; //2061(구현) 좋은 암호
import java.math.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    BigInteger num = new BigInteger(st.nextToken());
    int std = Integer.parseInt(st.nextToken());

    for(int i = 2; i < std; i++)
      if(num.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
        System.out.print("BAD " + i);
        return;
      }
    
    System.out.print("GOOD");
  }
}