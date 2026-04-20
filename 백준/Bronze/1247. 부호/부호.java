import java.util.*; //1247(수학) 부호
import java.math.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    Scanner sc = new Scanner(System.in);
    
    for(int i = 0; i < 3; i++) {
      int n = sc.nextInt();
      BigInteger sum = new BigInteger("0");
      while(n-- > 0) sum = sum.add(sc.nextBigInteger());
  
      if(sum.compareTo(BigInteger.ZERO) == -1) sb.append("-\n");
      else if(sum.compareTo(BigInteger.ZERO) == 1) sb.append("+\n");
      else sb.append("0\n");
    }
    System.out.print(sb);
  }
}