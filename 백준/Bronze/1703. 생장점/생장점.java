import java.util.*; //1703(구현) 생장점
import java.io.*; 

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    while(true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      if(n == 0) break;
      int sum = 1;
      
      for(int i = 0; i < 2*n; i++) {
        int t = Integer.parseInt(st.nextToken());
        if(i%2 == 0) sum *= t;
        else sum -= t;
      }
      
      sb.append(sum).append("\n");
    }
    
    System.out.print(sb);
  }
}