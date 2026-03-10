import java.io.*; //2914 저작권
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    System.out.print(Integer.parseInt(st.nextToken())*(Integer.parseInt(st.nextToken())-1)+1);
  }
}