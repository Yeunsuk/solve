import java.util.*; //1934(수학) 최소공배수
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static int gcd(int a, int b) {
    while(b != 0) {
      int t = a % b;
      a = b;
      b = t;
    }
    
    return a;
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine());
    
    for(int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Macro(st.nextToken());
      int b = Macro(st.nextToken());
      bw.write(a * b / gcd(a, b) + "\n");
    }

    bw.close();
  }
}