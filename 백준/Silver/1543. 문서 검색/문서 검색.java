import java.util.*; //1543(문자열) 문서 검색
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String test = br.readLine();
    String arr = br.readLine();
    int cnt = 0;
    
    while(test.length() > 0) {
      if(test.startsWith(arr)) {
        test = test.substring(arr.length());
        cnt++;
      }else test = test.substring(1);
    }
    
    bw.write(String.valueOf(cnt));
    bw.close();
  }
}