import java.util.*; //14736(수학) Coke Challenge
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int num = Macro(st.nextToken()), min = Integer.MAX_VALUE;
    int std = Macro(st.nextToken()) / Macro(st.nextToken());

    for(int i = 0; i < num; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Macro(st.nextToken());
      int b = Macro(st.nextToken());
      int quo = std / a;
      int mod = std % a;
      
      int tmp = mod == 0 ? (quo - 1) * (a + b) + a : quo * (a + b) + mod;
      min = Math.min(min, tmp);
    }

    bw.write(String.valueOf(min));
    bw.close();
  }
}