import java.util.*; //1015(정렬) 수열 정렬
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine());
    int[] std = new int[n];
    int[] arr = new int[n];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      int tmp = Macro(st.nextToken());
      std[i] = arr[i] = tmp;
    }
    
    Arrays.sort(arr);
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        if(std[i] == arr[j]) {
          bw.write(j + " ");
          arr[j] = -1;
          break;
        }
      }
    }
    
    bw.close();
  }
}