import java.util.*; //5671(수학) 호텔 방 번호
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    String str = "";
    
    while((str = br.readLine()) != null) {
      st = new StringTokenizer(str);
      
      int a = Macro(st.nextToken()), rlt = 0;
      int b = Macro(st.nextToken());
      
      for(int i = a; i <= b; i++) {
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        String tmp = Integer.toString(i);
        rlt++;
        
        for(int j = 0; j < tmp.length(); j++) {
          int cnt = Macro(String.valueOf(tmp.charAt(j)));
          arr[cnt]++;

          if(arr[cnt] > 1) {
            rlt--;
            break;
          }
        }
      }
  
      bw.write(rlt + "\n");
    }
    
    bw.close();
  }
}