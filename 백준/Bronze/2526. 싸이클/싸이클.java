import java.io.*; //2526 싸이클
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken()), idx = 0;
    int p = Integer.parseInt(st.nextToken());
    int[] arr = new int[p];
    Arrays.fill(arr, -1);
    int tmp = n%p;

    while (arr[tmp] == -1) {
      arr[tmp] = idx++;
      tmp = (tmp*n)%p;
    }

    System.out.print(idx - arr[tmp]);
  }
}