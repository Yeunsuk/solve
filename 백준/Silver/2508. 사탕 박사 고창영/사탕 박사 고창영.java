import java.util.*; //2508(구현) 사탕 박사 고창영
import java.awt.Stroke;
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Macro(br.readLine());
    
    while(Test-- > 0) {
      br.readLine();
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      int y = Macro(st.nextToken()), cnt = 0;
      int x = Macro(st.nextToken()), i, j;
      char[][] arr = new char[y][x];
      
      for(i = 0; i < y; i++) {
        String tmp = br.readLine();
        for(j = 0; j < x; j++) arr[i][j] = tmp.charAt(j);
      }
      
      for(i = 0; i < y; i++) {
        for(j = 0; j < x; j++) {
          if((j < x - 2) && arr[i][j] == '>' && arr[i][j + 1] == 'o' && arr[i][j + 2] == '<') cnt++; 
          if((i < y - 2) && arr[i][j] == 'v' && arr[i + 1][j] == 'o' && arr[i + 2][j] == '^') cnt++;
        }
      }
      
      bw.write(cnt + "\n");
    }
    
    bw.close();
  }
}