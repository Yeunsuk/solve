import java.util.*; //10430(구현) 나머지
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());
    
    System.out.printf("%d\n%d\n%d\n%d", (a+b)%c, ((a%c) + (b%c))%c, (a*b)%c, ((a%c) * (b%c))%c);
  }
}