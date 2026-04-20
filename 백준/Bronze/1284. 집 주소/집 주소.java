import java.util.*; //1284(수학) 집 주소
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    while(true) {
      String str = br.readLine();
      if(str.equals("0")) break;
      int cnt = str.length() + 1;
  
      for(int i = 0; i < str.length(); i++) {
        if(str.charAt(i) == '0') cnt += 4;
        else if(str.charAt(i) == '1') cnt += 2;
        else cnt += 3;
      }
  
      bw.write(String.valueOf(cnt));
      bw.newLine();
    }
    
    bw.flush();
  }
}