import java.util.*; //1598(구현) 꼬리를 무는 숫자 나열
import java.io.*; 

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int x = Integer.parseInt(st.nextToken()) - 1;
    int y = Integer.parseInt(st.nextToken()) - 1;
    
    System.out.print(Math.abs(x/4 - y/4) + Math.abs(x%4 - y%4));
  }
}