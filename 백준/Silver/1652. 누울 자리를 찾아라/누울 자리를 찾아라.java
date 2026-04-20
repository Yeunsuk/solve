import java.util.*; //1652(구현) 누울 자리를 찾아라
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Macro(br.readLine());
    int cnt, cnt_ln = 0, cnt_ly = 0;
    boolean[][] boo = new boolean[n][n];
    
    for(int i = 0; i < n; i++) {
      String[] tmp = br.readLine().split("");
      for(int j = 0; j < n; j++) {
        String t = tmp[j];

        if(t.equals(".")) boo[i][j] = true;
        else boo[i][j] = false;
      }
    }

    br.close();
    for(int i = 0; i < n; i++) {
      cnt = 0;
      for(int j = 0; j < n; j++) {
        if (boo[j][i]) cnt++;
        else {
          if(cnt > 1) cnt_ly++;
          cnt = 0;
        }
      }
      if(cnt > 1) cnt_ly++;
    }

    for(int i = 0; i < n; i++) {
      cnt = 0;
      for(int j = 0; j < n; j++) {
        if(boo[i][j]) cnt++;
        else {
          if (cnt > 1) cnt_ln++;
          cnt = 0;
        }
      }
      if(cnt > 1) cnt_ln++;
    }

    bw.write(cnt_ln + " " + cnt_ly);
    bw.flush();
  }
}