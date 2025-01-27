import java.util.*; //2446(구현) 별 찍기 - 9
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    for (int i = n; i >= 1; i--) {
      int a = n - i;
      int b = 2 * i - 1;
      bw.write(" ".repeat(a) + "*".repeat(b));
      bw.newLine();
    }

    for (int i = 2; i <= n; i++) {
      int a = n - i;
      int b = 2 * i - 1;
      bw.write(" ".repeat(a) + "*".repeat(b));
      bw.newLine();
    }

    bw.close();
  }
}