import java.util.*; //21854(수학) Monsters
import java.io.*;

public class Main {
  static int mod = 1_000_000_007;

  static long Cul(int tmp) {
    long base = 2, rlt = 1;
    
    while(tmp > 0) {
      if((tmp % 2) == 1) rlt = (rlt * base) % mod;
      base = (base * base) % mod;
      tmp = tmp / 2;
    }
    
    return rlt;
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    long sum = 0;

    StringTokenizer st = new StringTokenizer(br.readLine());
    while(Test-- > 0) {
      int n = Integer.parseInt(st.nextToken());
      sum = (sum + Cul(n)) % mod;
    }
    
    bw.write(String.valueOf(sum));
    bw.close();
  }
}