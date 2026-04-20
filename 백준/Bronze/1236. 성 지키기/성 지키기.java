import java.util.*; //1236(구현) 성 지키기
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int y = Macro(st.nextToken()), cnt = 0;
    int x = Macro(st.nextToken());
    String[] arr = new String[y];

    for(int i = 0; i < y; i++) {
      arr[i] = br.readLine();
      if(arr[i].contains("X") == false) cnt++;
    }

    int max = cnt;
    cnt = 0;
  
    for(int i = 0; i < x; i++) {
      int tmp = 0;
      
      for(int j = 0; j < y; j++) if(arr[j].charAt(i) == '.') tmp++;
      if(tmp == y) cnt++;
    }
    
    bw.write(String.valueOf(Math.max(max, cnt)));
    bw.close();
  }
}