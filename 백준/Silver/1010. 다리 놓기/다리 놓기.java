import java.util.*; //1010(dp) 다리 놓기
import java.math.*;
import java.io.*;

public class Main {
  static int[][] dp = new int[30][30];
  static int Macro(int x, int y) {
    if(dp[x][y] > 0) {
      return dp[x][y]; 
    }

    if(x == y || y == 0) {
      return dp[x][y] = 1;
    }
   
    return dp[x][y] = Macro(x - 1, y - 1) + Macro(x - 1, y);
  }

  public static void main(String[] args) throws IOException{ 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    while(Test-- > 0) {
      st = new StringTokenizer(br.readLine()," ");
      int West = Integer.parseInt(st.nextToken());
      int East = Integer.parseInt(st.nextToken());
      sb.append(Macro(East, West) + "\n");
    }

    br.close();
    sb.deleteCharAt(sb.length() - 1);
    System.out.print(sb);
  }
}