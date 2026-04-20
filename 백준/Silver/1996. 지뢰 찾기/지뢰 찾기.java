import java.util.*; //1996(구현) 지뢰찾기
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int[] y = {-1, -1, -1, 0, 0, 1, 1, 1};
    int[] x = {-1, 0, 1, -1, 1, -1, 0, 1};
    
    int num = Integer.parseInt(br.readLine());
    char[][] rlt = new char[num][num];
    char[][] arr = new char[num][num];

    for(int i = 0; i < num; i++) {
      String str = br.readLine();
      for(int j = 0; j < num; j++) arr[i][j] = str.charAt(j);
    }

    br.close();
    for(int i = 0; i < num; i++) {
      for(int j = 0; j < num; j++) {
        int cnt = 0;
        if(arr[i][j] != '.') {
          rlt[i][j] = '*';
          continue;
        }
        else
          for(int k = 0; k < 8; k++) {
            if(i + y[k] < 0 || i + y[k] >= num || j + x[k] < 0 || j + x[k] >= num) continue;
            if(arr[i + y[k]][j + x[k]] > '0') cnt += arr[i + y[k]][j + x[k]] - '0';
          }
        if(cnt < 10) rlt[i][j] = (char)(cnt + '0');
        else rlt[i][j] = 'M';
      }
    }

    for(int i = 0; i < num; i++) {
      for(int j = 0; j < num; j++) bw.write(rlt[i][j]);
      bw.write('\n');
    }
    bw.close();
  }
}