import java.util.*; //2160(구현) 그림 비교
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Macro(br.readLine()), min = 36;
    StringBuilder rlt = new StringBuilder();
    char[][] arr = new char[num][35];
    
    for(int i = 0; i < num; i++) {
      for(int j = 0; j < 5; j++) {
        String tmp = br.readLine();
        for(int k = 0; k < 7; k++) arr[i][j * 7 + k] = tmp.charAt(k);
      }
    }

    for(int i = 0; i < num - 1; i++) {
      for(int j = i + 1; j < num; j++) {
        int cnt = 0;

        for(int k = 0; k < 35; k++) {
          if(arr[i][k] != arr[j][k]) cnt++;
        }

        if(cnt < min) {
          min = cnt;
          rlt.setLength(0);
          rlt.append(i + 1).append(" ").append(j + 1);
        }
      }
    }
    
    bw.write(rlt.toString());
    bw.close();
  }
}