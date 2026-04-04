
import java.io.*; //2953 나는 요리사다
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int max=0, n=0, sum;

    for(int i = 0; i < 5; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      sum = 0;
      
      for(int j = 0; j < 4; j++) sum += Integer.parseInt(st.nextToken());
      
      if(max < sum) {
        max = sum;
        n = i+1;
      }
    }
    
    System.out.print(n + " " + max);
  }
}