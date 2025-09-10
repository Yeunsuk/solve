import java.util.*; // 3495(기하학) 아스키 도형
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int h = Integer.parseInt(st.nextToken()), cnt1 = 0;
    int w = Integer.parseInt(st.nextToken()), cnt2 = 0;
    char[][] arr = new char[h][w];

    for(int i = 0; i < h; i++) arr[i] = br.readLine().toCharArray();
    
    for(int i = 0; i < h; i++) {
      int tmp = 0;
      
      for(int j = 0; j < w; j++) {
        if(arr[i][j] == '/' || arr[i][j] == '\\') {
          cnt2++;
          tmp++;
        }else if(tmp % 2 == 1) cnt1++;
      }
    }
    
    bw.write(String.valueOf(cnt1 + cnt2 / 2));
    bw.close();
  }
}
