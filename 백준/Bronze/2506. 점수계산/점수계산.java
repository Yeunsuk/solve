import java.io.*; //2506 점수계산
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine()), sum = 0, tmp = 0;
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    while(num-- > 0) {
      if(Integer.parseInt(st.nextToken()) == 1) sum += ++tmp;
      else tmp = 0;
    }
    
    System.out.print(sum);
  }
}