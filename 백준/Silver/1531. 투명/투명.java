import java.util.*; //1531(구현) 투명
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Macro(st.nextToken()), i, cnt = 0;
    int m = Macro(st.nextToken()), j;
    int[][] arr = new int[101][101];
      
    for(i = 0; i < n; i++) {
        st = new StringTokenizer(br.readLine());
        int fx = Macro(st.nextToken());
        int fy = Macro(st.nextToken());
        int x = Macro(st.nextToken());
        int y = Macro(st.nextToken());
        
        for(j = fx; j < x + 1; j++) for(int k = fy; k < y + 1; k++) arr[j][k]++;
    }

    for(i = 1; i < 101; i++) for(j = 1; j < 101; j++) if(arr[i][j] > m) cnt++;
    bw.write(String.valueOf(cnt));
    bw.close();
  }
}