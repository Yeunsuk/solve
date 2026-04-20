import java.util.*; //1057(수학) 토너먼트
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int tmp = Macro(st.nextToken()), cnt = 0;
    int a = Macro(st.nextToken());
    int b = Macro(st.nextToken());

    while(a != b) {
      a = a / 2 + a % 2;
      b = b / 2 + b % 2;
      cnt++;
    }
    
    bw.write(String.valueOf(cnt));
    bw.flush();
  }
}