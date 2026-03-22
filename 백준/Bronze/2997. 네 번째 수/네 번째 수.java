import java.io.*; //2997 네 번째 수
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[3];

    StringTokenizer st = new StringTokenizer(br.readLine());
    arr[0] = Integer.parseInt(st.nextToken());
    arr[1] = Integer.parseInt(st.nextToken());
    arr[2] = Integer.parseInt(st.nextToken());
    Arrays.sort(arr);

    int n = arr[1]-arr[0], m = arr[2]-arr[1];
    System.out.print(n==m ? arr[2]+n : n<m ? arr[1]+n : arr[0]+m);
  }
}