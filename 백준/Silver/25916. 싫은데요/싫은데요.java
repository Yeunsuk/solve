import java.util.*; //25916(두 포인터) 싫은데요
import java.io.*;

public class Main {
  static int read() throws Exception {
    int c, n = System.in.read() & 15;
    while ((c = System.in.read()) > 32) n = (n << 3 ) + (n << 1) + (c & 15);
    return n;
  }
  
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int sum = 0, rlt = 0, a = 0;
    int n = read(), m = read();
    
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) arr[i] = read();

    for(int i = 0; i < n; i++) {
      sum += arr[i];
      
      while(sum > m) sum -= arr[a++];
      rlt = Math.max(rlt, sum);
    }
    
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}