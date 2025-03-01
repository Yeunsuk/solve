import java.util.*; //21285(구현) Namnsdag
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int len = str.length();
    
    int num = Integer.parseInt(br.readLine()), rlt = 0;
    for(int i = 1; i < num + 1; i++) {
      String tmp = br.readLine();
      int cnt = 0;

      if(tmp.length() == len) {
        for(int j = 0; j < len; j++) {
          if(tmp.charAt(j) != str.charAt(j)) cnt++;
          if(cnt == 2) break;
        }
        
        if(cnt == 1) {
          rlt = i;
          break;
        }
      }else continue;
    }
    
    bw.write(String.valueOf(rlt == 0 ? num : rlt));
    bw.close();
  }
}