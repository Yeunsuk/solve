import java.util.*; //1312(수학) 소수
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());
    a %= b;

    for(int i = 0; i < n - 1; i++) a = 10 * a % b;
    System.out.print(10 * a / b);
  }
}