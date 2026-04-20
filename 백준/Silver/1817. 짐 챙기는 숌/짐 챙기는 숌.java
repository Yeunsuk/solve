import java.util.*; //1817(그리디) 짐 챙기는 숌
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Macro(st.nextToken()), cnt = 1, i;
    int w = Macro(st.nextToken()), tmp = 0;
    int[] arr = new int[n];

    if(n == 0) {
      bw.write("0");
      bw.close();
      return;
    }

    st = new StringTokenizer(br.readLine());
    for(i = 0; i < n; i++) arr[i] = Macro(st.nextToken());
    
    for(i = 0; i < n; i++) {
      tmp += arr[i];
      if(tmp > w) {
        tmp = arr[i];
        cnt++;
      }
    }

    bw.write(String.valueOf(cnt));
    bw.close();
  }
}