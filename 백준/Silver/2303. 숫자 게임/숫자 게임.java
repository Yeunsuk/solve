import java.util.*; //2303(구현) 숫자 게임
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()), std = 0, num;
    String[][] arr = new String[n][5];
    int[] rlt = new int[n];
    
    for(int i = 0; i < n; i++) {
      String tmp = br.readLine();
      arr[i] = tmp.split(" ");
      int sum = 0;

      for(int j = 0; j < 3; j++) {
        for(int k = j + 1; k < 4; k++) {
          for(int l = k + 1; l < 5; l++) {
            int t = Macro(arr[i][j]) + Macro(arr[i][k]) + Macro(arr[i][l]);
            if(sum <= t % 10) sum = t % 10;
          }
        }
      }
      
      rlt[i] = sum;
    }
            
    num = rlt[0];
    for(int i = 0; i < rlt.length; i++) {
      if(rlt[i] >= num) {
        num = rlt[i];
        std = i + 1;
      }
    }

    bw.write(String.valueOf(std));
    bw.close();
  }
}