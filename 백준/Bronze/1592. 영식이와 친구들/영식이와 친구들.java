import java.io.*; //1592 영식이와 친구들
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken()), cnt=0;
    int m = Integer.parseInt(st.nextToken()), i=1;
    int l = Integer.parseInt(st.nextToken());
    int[] arr = new int[n+1];
    
    while(true) {
      arr[i]++;
      if(arr[i]==m) break;
      i = (i +(arr[i]%2 == 1 ? l : -l) -1 +n) %n +1;
      cnt++;
    }

    System.out.print(cnt);
  }
}