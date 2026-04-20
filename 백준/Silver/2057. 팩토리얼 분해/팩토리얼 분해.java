import java.util.*; //2057(그리디) 팩토리얼 분해
import java.io.*;

public class Main {
  static long Macro(String str) {
    return Long.parseLong(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long n = Macro(br.readLine());
    long[] arr = new long[21];
    br.close();
    arr[0] = 1;
    int i;
    
    for(i = 1; i < 21; i++) {
      arr[i] = arr[i - 1] * i;
    }
    
    if(n == 0) bw.write("NO");
    else {
      for(i = 20; i > -1; i--) if(n >= arr[i]) n -= arr[i];
      if(n == 0) bw.write("YES");
      else bw.write("NO");
    }
    
    bw.close();
  }
}