import java.io.*; //11943 파일 옮기기
import java.util.*;

public class Main {
  static int stoi(String s) {
    return Integer.parseInt(s);
  }
    
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = stoi(st.nextToken()), b = stoi(st.nextToken());
    st = new StringTokenizer(br.readLine());
    b += stoi(st.nextToken());
    a += stoi(st.nextToken());
    
    System.out.print(Math.min(a, b));
  }
}