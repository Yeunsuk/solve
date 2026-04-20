import java.util.*; //13241(수학) 최소공배수
import java.io.*;

public class Main {
  public static long Macro(long a, long b) {
    while(b > 0) {
      long tmp = a;
      a = b;
      b = tmp % b;
    }
    
    return a;
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    long a = Integer.parseInt(st.nextToken());
    long b = Integer.parseInt(st.nextToken());
    br.close();

    long rlt = Macro(Math.max(a, b), Math.min(a, b));
    bw.write(String.valueOf((a * b) / rlt));
    bw.close();
  }
}