import java.io.*; //8710 Koszykarz
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    
    int n = Integer.parseInt(st.nextToken()) - a;
    int m = Integer.parseInt(st.nextToken());

    System.out.print(n/m + (n%m>0 ? 1 : 0));
  }
}