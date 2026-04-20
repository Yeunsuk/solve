import java.util.*; //2480(수학) 주사위 세개
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());

    if(a == b && a == c) System.out.print(10000 + a * 1000);
    else if(a == b && a != c) System.out.print(1000 + a * 100);
    else if(b == c && b != a) System.out.print(1000 + b * 100);
    else if(c == a && c != b) System.out.print(1000 + c * 100);
    else {
      int h = a;
      if(h < b) h = b;
      if(h < c) h = c;
      System.out.print(h * 100);
    }
  }
}