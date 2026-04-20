import java.util.*; //1924(수학) 2007년
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    int[] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    StringTokenizer st = new StringTokenizer(br.readLine());
    int m = Macro(st.nextToken()), n = 0;
    int d = Macro(st.nextToken());
    
    for(int i = 0; i < m; i++) n += mon[i];
    n += d - 1;
    
    bw.write(String.valueOf(day[n % 7]));
    bw.close();
  }
}