import java.io.*; //2154 수 이어 쓰기 3
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for(int i=1; i<=n; i++) sb.append(i);

    System.out.print(sb.indexOf(Integer.toString(n))+1);
  }
}