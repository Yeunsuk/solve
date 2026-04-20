import java.util.*; //2960(수학) 에라토스테네스의 체
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Macro(st.nextToken());
    int k = Macro(st.nextToken());
    br.close();

    if(n >= k * 2) {
      bw.write(String.valueOf(k * 2));
      bw.flush();
    }
    else {
      int[] arr = new int[n + 1];
      int cnt = 0, i;
  
      for(i = 1; i < n + 1; i++) arr[i] = i;
      for(i = 2; i < n + 1; i++) {
        for(int j = i; j < n + 1; j += i) {
          if(!(arr[j] == 0)) {
            arr[j] = 0;
            cnt++;
          }
          
          if(cnt == k) {
            bw.write(String.valueOf(j));
            bw.flush();
            return;
          }
        }
      }
    }
  }
}
  