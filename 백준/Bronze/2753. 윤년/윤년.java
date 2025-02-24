import java.util.*; //2753(수학) 윤년
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    bw.write(n % 4 == 0 && (n % 400 == 0 || n % 100 != 0) ? "1" : "0");
    bw.close();
  }
}