import java.util.*; //15829(문자열) Hashing
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long rlt = 0, pow = 1, mod = 1234567891;
    int n = Integer.parseInt(br.readLine());
    String str = br.readLine();
    
    for(int i = 0; i < n; i++) {
      rlt = (rlt + (str.charAt(i) - 96) * pow) % mod;
      pow = (pow * 31) % mod;
    }
    
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}