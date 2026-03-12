import java.io.*; //1975 Number Game

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    while(Test-- > 0) {
      int n = Integer.parseInt(br.readLine()), cnt=0;
   
      for(int j = 2; j <= n; j++) {
        int tmp = n;
   
        while(true) {
          if(tmp%j != 0) break;
          tmp /= j;
          cnt++;
        }
      }
      
      sb.append(cnt).append("\n");
    }

    System.out.print(sb);
  }
}