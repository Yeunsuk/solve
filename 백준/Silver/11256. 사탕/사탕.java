import java.util.*; //11256(그리디) 사탕
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Macro(br.readLine());
    StringTokenizer st;

    while(Test-- > 0) {
      st = new StringTokenizer(br.readLine());
      int num = Macro(st.nextToken());
      int box = Macro(st.nextToken());
      Integer[] ar = new Integer[box];
      int cnt = 0;
  
      for(int i = 0; i < box; i++) {
        st = new StringTokenizer(br.readLine());
        ar[i] = Macro(st.nextToken()) * Macro(st.nextToken());
      }

      Arrays.sort(ar, Collections.reverseOrder());
      while(num > 0) {
        num -= ar[cnt];
        cnt++;
      }
        
      bw.write(String.valueOf(cnt));
      bw.newLine();
    }

    bw.close();
  }
}