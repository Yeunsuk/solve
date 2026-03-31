import java.io.*; //15963 CASIO
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    System.out.print(Long.parseLong(st.nextToken())==Long.parseLong(st.nextToken()) ? 1 : 0);
  }
}