import java.util.*; //10757(구현) 큰 수 A+B
import java.math.*;
import java.io.*; 

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    System.out.print(new BigInteger(st.nextToken()).add(new BigInteger(st.nextToken())));
  }
}