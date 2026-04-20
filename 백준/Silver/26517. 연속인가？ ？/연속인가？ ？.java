import java.util.*; //26517(수학) 연속인가??
import java.io.*;

public class Main {
  static long Macro(String str) {
    return Long.parseLong(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long n = Macro(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    long std = n * Macro(st.nextToken()) + Macro(st.nextToken());
    if(std == n * Macro(st.nextToken()) + Macro(st.nextToken())) bw.write("Yes " + std);
    else bw.write("No");
    bw.close();
  }
}