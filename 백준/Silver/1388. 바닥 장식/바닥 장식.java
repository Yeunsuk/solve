import java.util.*; //1388(구현) 바닥장식
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int x = Macro(st.nextToken()), cnt = 0;
    int y = Macro(st.nextToken()), i, j;
    char[][] arr = new char[x][y];
    
    for(i = 0; i < x; i++) {
      String str = br.readLine();
      for(j = 0; j < y; j++) arr[i][j] = str.charAt(j);
    }

    for(i = 0; i < x; i++) {
      for(j = 0; j < y; j++) {
        if(arr[i][j] == '-') {
          if(j == y - 1) cnt++;
          else if(arr[i][j + 1] == '|') cnt++;
        }
        else {
          if(i == x - 1) cnt++;
          else if(arr[i + 1][j] == '-') cnt++;
        }
      }
    }
    
    bw.write(String.valueOf(cnt));
    bw.close();
  }
}