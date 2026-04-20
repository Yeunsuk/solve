import java.util.*; // 1027 고층건물
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int num = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine()," ");
    Integer[] arr_result = new Integer[num];
    int[] arr_orgin = new int[num];

    for(int i = 0; i < num; i++) {
        arr_orgin[i] = Integer.parseInt(st.nextToken());
        arr_result[i] = 0;
      }

    for(int i = 0; i < num - 1; i++) {
      arr_result[i]++;
      arr_result[i + 1]++;
      double inc = arr_orgin[i + 1] - arr_orgin[i];
      for(int j = i + 2; j < num; j++) { 
        if(inc < (double)(arr_orgin[j] - arr_orgin[i]) / (j - i)) {
          inc = (double)(arr_orgin[j] - arr_orgin[i]) / (j - i);
          arr_result[i]++;
          arr_result[j]++;
        }
      }
    }
    Arrays.sort(arr_result, Collections.reverseOrder());
    System.out.print(arr_result[0]);
  }
}