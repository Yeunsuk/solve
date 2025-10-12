import java.util.*; //1914(재귀) 하노이 탑
import java.math.*;
import java.io.*;

public class Main {
  static StringBuilder sb = new StringBuilder();
  
  static void hanoi(int n, char stt, char end, char tmp) {
    if(n == 1) sb.append(stt).append(" ").append(end).append("\n");
    else {
      hanoi(n - 1, stt, tmp, end);
      sb.append(stt).append(" ").append(end).append("\n");
      hanoi(n - 1, tmp, end, stt);
    }
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    
    BigInteger cnt = BigInteger.valueOf(2).pow(num).subtract(BigInteger.ONE);
    sb.append(cnt).append("\n");
    
    if(num < 21) hanoi(num, '1', '3', '2');
    bw.write(sb.toString());
    bw.close();
  }
}