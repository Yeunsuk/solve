import java.util.*; //30890(수학) 드럼
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  static int Gcd(int a, int b) {
    int tmp;
    
    while (b != 0) {
      tmp = a % b;
      a = b;
      b = tmp;
    }
    
    return a;
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    int x = Macro(st.nextToken()), cnt = 0;
    int y = Macro(st.nextToken());
    int a = Math.max(x, y);
    int b = Math.min(x, y);

    int lcm = (a * b) / Gcd(a, b) + 1;
    int[] arr = new int[lcm];
    
    for(int i = 0; i < lcm; i += x) {
      arr[i] = 2;
    }

    for(int i = 0; i < lcm; i += y) {
      if(arr[i] == 2) arr[i] = 3;
      else arr[i] = 1;
    }

    while(cnt < a)
    for(int i = 1; i < lcm; i++) {
      if(arr[i] == 0) {
        continue;
      }else {
        sb.append(arr[i]);
        cnt++;
      }
    }

    bw.write(sb.toString());
    bw.close();
  }
}