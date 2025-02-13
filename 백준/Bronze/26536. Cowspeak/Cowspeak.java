import java.util.*; //26536(문자열) Cowspeak
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    
    while(Test-- > 0) {
      String[] arr = br.readLine().split(" ");
      
      for(String str : arr) {
        int len = str.length(), cnt = 0;

        while(cnt < len && str.charAt(cnt) == 'M') cnt++;
        bw.write((char)(16 * cnt + len - cnt));
      }
        
      bw.newLine();  
    }
    
    bw.close();
  }
}