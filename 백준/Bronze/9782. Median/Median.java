import java.io.*; //9782 Median
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int T = 0;

    while(true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      if(n==0) break;

      int[] arr = new int[n];
      for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

      int rlt;
      if(n%2 == 1) rlt = arr[n/2] * 10;
      else rlt = (arr[n/2 -1] + arr[n/2]) * 5;
      sb.append("Case ").append(++T).append(": ").append(rlt/10).append(".").append(rlt%10).append("\n");
    }

    System.out.print(sb);
  }
}