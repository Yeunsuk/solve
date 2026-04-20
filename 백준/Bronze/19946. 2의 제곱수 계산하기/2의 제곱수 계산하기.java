import java.math.*; //19946(구현) 2의 제곱수 계산하기
import java.util.*; 
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    br.close();

    if(str.equals("18446744073709551615")) bw.write("64");
    else {
      BigInteger num = new BigInteger(str), t = new BigInteger("2");
      long n = Long.parseLong(String.valueOf(num.divide(t)));
      int cnt = 63;

      while(n % 2 == 0) {
        n /= 2;
        cnt--;
      }

      bw.write(String.valueOf(cnt));
    }

    bw.close();
  }
}
