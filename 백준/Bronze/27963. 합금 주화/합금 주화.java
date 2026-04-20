import java.util.*; //27963(수학) 합금 주화
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Macro(st.nextToken());
    int b = Macro(st.nextToken());
    
    double max = Math.max(a, b), min = Math.min(a, b);
    int rate = Macro(st.nextToken());

    double rlt = ((100 - rate) / min) + (rate / max);
    bw.write(String.valueOf((100 / rlt)));
    bw.close();
  }
}