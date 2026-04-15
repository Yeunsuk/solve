import java.io.*; //2355 시그마
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    long n=Long.parseLong(st.nextToken()), m=Long.parseLong(st.nextToken());
    long a=Math.min(n,m), b=Math.max(n,m);
    long sum = (a+b) * ((b-a+1) /2);

    if((b-a+1)%2 != 0) sum += (a+b) /2;
    System.out.print(sum);
  }
}