import java.io.*; //11005 진법 변환 2
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int a = Integer.parseInt(st.nextToken());
    StringBuilder sb = new StringBuilder();

    while(n>0) {
      int tmp = n%a;

      if(tmp<10) sb.append((char)(tmp + '0'));
      else sb.append((char)(tmp - 10 + 'A'));
      n /= a;
    }

    System.out.print(sb.reverse());
  }
}