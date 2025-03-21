import java.util.*; //9228(수학) Check Digits
import java.io.*;

public class Main {
  static int[] arr;
  
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    while(true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int num = Macro(st.nextToken()), cnt = 0;
      int ber = Macro(st.nextToken());
      if(num == 0 && ber == 0) break;

      st = new StringTokenizer(br.readLine());
      int[] arr = new int[10_001];
      
      for(int i = 0; i < ber; i++) {
        arr[Macro(st.nextToken())]++;
      }

      for(int i = 0; i < 10_001; i++) {
        if(arr[i] > 1) cnt++;
      }
      
      sb.append(cnt).append("\n");
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}