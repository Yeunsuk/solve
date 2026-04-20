import java.util.*; //5800(구현) 성적 통계 
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int Test = Macro(br.readLine());
    StringTokenizer st;
    int num = 0;

    while(Test > num++) {
      st = new StringTokenizer(br.readLine());
      int n = Macro(st.nextToken()), i;
      Integer[] arr = new Integer[n];
      int tmp = 0, mn, mx;

      for(i = 0; i < n; i++) arr[i] = Macro(st.nextToken());
      Arrays.sort(arr, Collections.reverseOrder());
      mn = arr[n - 1];
      mx = arr[0];
      
      for(i = 0; i < arr.length - 1; i++) tmp = Math.max(tmp, Math.abs(arr[i] - arr[i + 1]));
      sb.append("Class " + num + "\nMax " + mx + ", Min " + mn + ", Largest gap " + tmp + "\n");
    }
    
    bw.write(String.valueOf(sb));
    bw.close();
  }
}