import java.util.*; //1373(수학) 2진수 8진수
import java.math.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BigInteger tmp = new BigInteger(br.readLine(), 2);
    bw.write(String.valueOf(tmp.toString(8)));
    bw.close();
  }
}