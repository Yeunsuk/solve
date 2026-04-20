import java.util.*; //1440(구현) 타임머신
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int cnt = 0;
    StringTokenizer st = new StringTokenizer(br.readLine(), ":");
    int[] arr = {Macro(st.nextToken()), Macro(st.nextToken()), Macro(st.nextToken())};
    
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        if(i == j) continue;
        
        for(int k = 0; k < 3; k++) {
          if(k == i || k == j) continue;
          int tmp = arr[i];
          
          if(0 < tmp && tmp < 13 && arr[j] < 60 && arr[k] < 60) cnt++;
        }
      }
    }

    bw.write(String.valueOf(cnt));
    bw.close();
  }
}