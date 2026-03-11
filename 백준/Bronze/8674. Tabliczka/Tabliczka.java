import java.io.*; //8674 Tabliczka
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    long a = Long.parseLong(st.nextToken());
    long b = Long.parseLong(st.nextToken());

    System.out.print((a&1)==0 || (b&1)==0 ? 0 : Math.min(a,b));
  }
}