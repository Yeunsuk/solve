import java.util.*; //4108(구현) 지뢰찾기
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    
    int[] y = {-1, -1, -1, 0, 0, 1, 1, 1};
    int[] x = {-1, 0, 1, -1, 1, -1, 0, 1};

    while(true) {
      st = new StringTokenizer(br.readLine());
      int hgh = Macro(st.nextToken()), i;
      int len = Macro(st.nextToken()), j;

      if(hgh == 0 && len == 0) break;
      char[][] rlt = new char[hgh][len];
      char[][] arr = new char[hgh][len];
          
      for(i = 0; i < hgh; i++) {
        String str = br.readLine();
        for(j = 0; j < len; j++) arr[i][j] = str.charAt(j);
      }
  
      for(i = 0; i < hgh; i++) {
        for(j = 0; j < len; j++) {
          int cnt = 0;
              
          if(arr[i][j] == '*') rlt[i][j] = '*';
          else {
            for(int k = 0; k < 8; k++) {
              if(i + y[k] < 0 || i + y[k] >= hgh || j + x[k] < 0 || j + x[k] >= len) continue;
              if(arr[i + y[k]][j + x[k]] == '*') cnt++;
            }
                
            rlt[i][j] = Character.forDigit(cnt, 10);
          }
        }
      }
  
      for(i = 0; i < hgh; i++) {
         for(j = 0; j < len; j++) sb.append(rlt[i][j]);
        sb.append('\n');
      }
    }
        
    bw.write(sb.toString());
    bw.close();
  }
}