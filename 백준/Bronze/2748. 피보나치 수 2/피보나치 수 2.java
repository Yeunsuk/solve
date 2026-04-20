import java.util.*; //2748(dp) 피보나치 수 2
import java.io.*;

public class Main {

  public static long fibo(int n) { //피보나치 수열
    long fb1 = 1;
    long fb2 = 1;
    long fb3 = 0;
    if(n == 1 || n == 2) {
      return 1;
    }else {
      for(int i = 2; i < n; i++) {
        fb3 = fb1 + fb2;
        fb1 = fb2;
        fb2 = fb3;
      }
      return fb3;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    System.out.print(fibo(n));
  }
}