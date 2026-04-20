import java.io.*; //10815
import java.util.*;

public class Main {

  public static int Search(int[] arr, int low, int high, int key) {
    if(high >= low) {
      int mid = low + (high - low) / 2;
      if(arr[mid] == key) {
        return 1;
      }else if(arr[mid] > key) {
        return Search(arr, low, mid - 1, key);
      }else{
        return Search(arr, mid + 1, high, key);
      }
    }
    return 0;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    int N1 = Integer.parseInt(br.readLine());
    int[] str1 = new int[N1];
    st = new StringTokenizer(br.readLine()," ");
    for(int i = 0; i < N1; i++) {
      str1[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(str1);

    int N2 = Integer.parseInt(br.readLine());
    int num;
    st = new StringTokenizer(br.readLine()," ");
    for(int i = 0; i < N2; i++) {
      num = Integer.parseInt(st.nextToken());
      sb.append(Search(str1, 0, N1 - 1, num)).append(" ");
    }
    br.close();
    System.out.println(sb);
  }
}