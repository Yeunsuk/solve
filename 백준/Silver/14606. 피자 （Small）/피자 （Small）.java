import java.util.*; //14606(dp) 피자 (Small)
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] dp = {0, 0, 1, 3, 6, 10, 15, 21, 28, 36, 45};
    System.out.print(dp[Integer.parseInt(br.readLine())]);
  }
}