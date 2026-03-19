import java.io.*; //2435 기상청 인턴 신현수
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int num = 0, max = -10_001;
    int[] arr = new int[n];

    st = new StringTokenizer(br.readLine());
    for(int i=0; i<n; i++) {
      arr[i] += Integer.parseInt(st.nextToken());
      if(i<m) num+=arr[i];
    }

    for(int i=m; i<n; i++) {
      max = Math.max(max, num);
      num-= arr[i-m];
      num+= arr[i];
    }

    System.out.print(Math.max(max, num));
  }
}