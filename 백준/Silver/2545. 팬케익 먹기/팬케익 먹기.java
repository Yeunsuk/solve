import java.util.*; //2545(그리디) 팬케익 먹기
import java.io.*;

public class Main {
  static long Macro(String str) {
    return Long.parseLong(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long Test = Macro(br.readLine());

    while(Test-- > 0) {
      br.readLine();
      StringTokenizer st = new StringTokenizer(br.readLine());
      long[] arr = {Macro(st.nextToken()), Macro(st.nextToken()), Macro(st.nextToken())};
      long n = arr[0] + arr[1] + arr[2] - Macro(st.nextToken()), a, b;
      Arrays.sort(arr);

      a = Math.min(arr[0], n / 3);
      b = Math.min(arr[1], (n - a) / 2);
      bw.write(a * b * (n - a - b) + "\n");
    }
    
    bw.close();
  }
}