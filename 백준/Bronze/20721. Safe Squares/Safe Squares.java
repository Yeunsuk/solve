import java.util.*; //20721(구현) Safe Squares 
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[][] arr = new char[8][8];
    int cnt = 0, low = 0;

    for(int i = 0; i < 8; i++) {
      String str = br.readLine();
      boolean tmp = false;
      for(int j = 0; j < 8; j++) {
        arr[i][j] = str.charAt(j);
        if(arr[i][j] == 'R') tmp = true;
      }

      if(tmp) cnt++;
    }

    for(int i = 0; i < 8; i++) {
      boolean tmp = false;
      for(int j = 0; j < 8; j++) {
        if(arr[j][i] == 'R') tmp = true;
      }

      if(tmp) low++;
    }

    bw.write(String.valueOf((8 - cnt) * (8 - low)));
    bw.close();
  }
}