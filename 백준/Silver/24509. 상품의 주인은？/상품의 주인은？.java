import java.util.*; //24509(구현) 상품의 주인은?
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Macro(br.readLine());
    int[][] arr = new int[num][5];
    
    for(int i = 0; i < num; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j = 0; j < 5; j++) arr[i][j] = Macro(st.nextToken());
    }

    for(int j = 1; j < 5; j++) {
      int idx = j;
      
      Arrays.sort(arr, (row1, row2) -> {
          int rule = Integer.compare(row2[idx], row1[idx]);
          if(rule == 0) {
            return Integer.compare(row1[0], row2[0]);
          }
          return rule;
      });
      
      bw.write(arr[0][0] + " ");
      for(int i = 0; i < 5; i++) {
        arr[0][i] = -1;
      }
    }
    
    bw.close();
  }
}