import java.util.*; //10176(문자열) Opposite Words
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    
    while(Test-- > 0) {
      String str = br.readLine().toLowerCase();
      int[] arr = new int[26];
      boolean std = true;

      for(int i = 0; i < str.length(); i++) {
        char tmp = str.charAt(i);
        if('a' <= tmp && tmp <= 'z') {
          arr[tmp - 'a']++;
        }
      }

      for(int i = 0; i < 13; i++) {
        if(arr[i] != arr[25 - i]) {
          std = false;
          break;
        }
      }
        
      bw.write(std ? "Yes\n" : "No\n");  
    }
    
    bw.close();
  }
}