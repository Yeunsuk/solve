import java.util.*; //2669(구현) 직사각형 네개의 합집합의 면적 구하기
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean[][] arr = new boolean[101][101];
    int cnt = 0;

    for(int i = 0; i < 4; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int x1 = Macro(st.nextToken()), y1 = Macro(st.nextToken());
      int x2 = Macro(st.nextToken()), y2 = Macro(st.nextToken());

      for(int j = y1; j < y2; j++) for(int k = x1; k < x2; k++) arr[j][k] = true;
    }
    
    for(int i = 0; i < 101; i++) {
      for(int j = 0; j < 101; j++) {
        if(arr[i][j] == true) cnt++;
      }
    }
    
    bw.write(String.valueOf(cnt));
    bw.close();
  }
}