import java.util.*; //10211(dp) Maximum Subarray
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Macro(br.readLine());
    
    while(Test-- > 0) {
      int n = Macro(br.readLine());
      int[] arr = new int[n];
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int i = 0; i < n; i++) arr[i] = Macro(st.nextToken());
      
      int tmp = arr[0], max = arr[0];
      for (int i = 1; i < n; i++) {
        tmp = Math.max(arr[i], tmp + arr[i]);
        max = Math.max(max, tmp);
      }
      
      bw.write(max + "\n");
    }
    
    bw.close();
  }
}