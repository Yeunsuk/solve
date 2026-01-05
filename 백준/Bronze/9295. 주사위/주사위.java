import java.util.*; //9295(구현) 주사위
import java.io.*; 

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    for(int i = 1; i <= Test; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
      sb.append("Case ").append(i).append(": ").append(sum).append("\n");
    }
    
    System.out.print(sb);
  }
}