import java.util.*; //1350(수학) 진짜 공간
import java.io.*;

public class Main {
  static long Macro(String str) {
    return Long.parseLong(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    long siz = Macro(br.readLine()), cnt = 0;
    
    for(int i = 0; i < n; i++) {
      long tmp = Macro(st.nextToken());

      if(tmp != 0) {
        cnt += tmp / siz;
        if(tmp % siz != 0) cnt++;
      }
    }
    
    bw.write(String.valueOf(siz * cnt));
    bw.close();
  }
}