import java.util.*; //9047(문자열) 6174
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Macro(br.readLine()), std = 6174;
    
    while(Test-- > 0) {
      int tmp = Macro(br.readLine()), cnt = 0;
      
      while(tmp != std) {
        int[] arr = new int[4];
        
        for(int i = 0; i < 4; i++) {
          arr[i] = tmp % 10;
          tmp /= 10;
        }
        
        Arrays.sort(arr);
        int max = 0, min = 0;
        for(int i = 0; i < 4; i++) {
          max = max * 10 + arr[3 - i];
          min = min * 10 + arr[i];
        }
        
        tmp = max - min;
        cnt++;
      }

      bw.write(cnt + "\n");
    }
    
    bw.close();
  }
}