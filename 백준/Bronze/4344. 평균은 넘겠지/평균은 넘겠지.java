import java.util.*; //4344(수학) 평균은 넘겠지
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

    while(Test-- > 0) {
      st = new StringTokenizer(br.readLine());
      int n = Macro(st.nextToken()), i;
      double sum = 0, cnt = 0;
      int[] arr = new int[n];
      
      for(i = 0; i < n; i++) {
        arr[i] = Macro(st.nextToken());
        sum += arr[i];
      }
      
      sum /= n;
      for(i = 0; i < n; i++) if(arr[i] > sum) cnt++;

      String s = String.format("%.3f", cnt / n * 100);
      sb.append(s + "%\n"); 
    }
    
    bw.write(String.valueOf(sb));
    bw.close();
  }
}