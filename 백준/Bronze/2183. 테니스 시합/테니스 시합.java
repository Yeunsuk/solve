import java.io.*; //2183 테니스 시함
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
     
    st.nextToken();
    String str = st.nextToken();
    System.out.print(str.charAt(str.length() - 1));
  }
}