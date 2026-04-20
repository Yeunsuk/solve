import java.util.*; //13717(구현) 포켓몬 GO
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine());
    String[] na = new String[n];
    int[][] arr = new int[n][2];
    int rlt = 0, max = 0;
    String name = "";

    for(int i = 0; i < n; i++) {
      na[i] = br.readLine();
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      arr[i][0] = Macro(st.nextToken());
      arr[i][1] = Macro(st.nextToken());
    }

    for(int i = 0; i < n; i++) {
      int std = arr[i][1];
      int cnt = 0;
      
      while(true) {
        if(std >= arr[i][0]) {
          std -= arr[i][0] - 2;
          rlt += 1;
          cnt += 1;
        }else break;
      }
      if(cnt > max) {
        name = na[i];
        max = cnt;
      }
    }
    
    bw.write(rlt + "\n" + name);
    bw.close();
  }
}