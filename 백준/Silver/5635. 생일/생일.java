import java.util.*; //5635(구현) 생일
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine());
    StringTokenizer st;
    
    int[] y = new int[n], m = new int[n], d = new int[n];
    String[] na = new String[n];
    int fst = 0, sec = 0;

    for(int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      na[i] = st.nextToken();
      d[i] = Macro(st.nextToken());
      m[i] = Macro(st.nextToken());
      y[i] = Macro(st.nextToken());
      
      if(y[i] > y[fst] || (y[i] == y[fst] && m[i] > m[fst]) || (y[i] == y[fst] && m[i] == m[fst] && d[i] > d[fst])) fst = i;
      if(y[i] < y[sec] || (y[i] == y[sec] && m[i] < m[sec]) || (y[i] == y[sec] && m[i] == m[sec] && d[i] < d[sec])) sec = i;
    }
    
    bw.write(na[fst] + "\n" + na[sec]);
    bw.close();
  }
}