import java.util.*; //1874(스택) 스택 수열 
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException{ 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    int num = Integer.parseInt(br.readLine());
    int[] arr = new int[num];
    int cnt = 0; int idx = 0;

    while(num-- > 0) {
      int n = Integer.parseInt(br.readLine());

      if(n > cnt) {
        for(int i = cnt + 1; i < n + 1; i++) {
          sb.append("+\n");
          arr[idx] = i;
          idx++;
        }
        cnt = n;
      }
 
      else if(arr[idx - 1] != n) {
        System.out.print("NO");
        return;
      }

      sb.append("-\n");
      idx--;
    }
    
    System.out.print(sb);
  }
}