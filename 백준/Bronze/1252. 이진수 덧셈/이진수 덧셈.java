import java.util.*; //1252(수학) 이진수 덧셈
import java.math.*;
import java.io.*;

public class Main {  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    BigInteger a = new BigInteger(st.nextToken(), 2);
    BigInteger b = new BigInteger(st.nextToken(), 2);
    bw.write(String.valueOf(a.add(b).toString(2)));
    bw.close();
  }
}