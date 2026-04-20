import java.util.*; //1009(수학) 분산처리
import java.io.*;

public class Main {
  static int[][] arr = {{0}, {1}, {2, 4, 8, 6}, {3, 9, 7, 1}, {4, 6}, {5}, {6}, {7, 9, 3, 1}, {8, 4, 2, 6}, {9, 1}, {10}};
  
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Macro(br.readLine());
    StringTokenizer st;
    int rlt, a, b, i;

    while(Test-- > 0) {      
      st = new StringTokenizer(br.readLine());
      a = Macro(st.nextToken()) % 10;
      b = Macro(st.nextToken()) % 100;
      rlt = 1;

      for(i = 1; i <= b; i++) rlt = rlt * a % 10;
      rlt = rlt == 0 ? 10 : rlt;
      bw.write(rlt + "\n");
    }

    bw.close();
  }
}