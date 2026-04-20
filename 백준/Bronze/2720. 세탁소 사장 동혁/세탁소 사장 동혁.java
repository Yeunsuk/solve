import java.util.*; //2720(수학) 세탁소 사장 동혁
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int Test = Integer.parseInt(br.readLine());
    for(int i = 0; i < Test; i++) {
      int n = Integer.parseInt(br.readLine());
      sb.append(n / 25).append(" "); n %= 25;
      sb.append(n / 10).append(" "); n %= 10;
      sb.append(n / 5).append(" "); n %= 5;
      sb.append(n).append(" ");
    }
    System.out.println(sb);
  }
}