import java.util.*; //1065(수학) 한수
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()) + 1, cnt = 0;

    for(int i = 1; i < n; i++) {
      if(i / 100 == 0) cnt++;
      else if(i / 1000 == 0) {
        int b = (i % 100) / 10;
        int a = i / 100;
        int c = i % 10;

        if(a - b == b - c) cnt++;
      }
    }

    bw.write(String.valueOf(cnt));
    bw.close();
  }
}