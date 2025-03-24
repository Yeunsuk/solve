import java.util.*; //20225(구현) Contact Tracer
import java.io.*;

public class Main {
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
      int event = Macro(st.nextToken());
      int tmp = Macro(st.nextToken());

      if(num == 0 && event == 0 && tmp == 0) break;
      boolean[] arr = new boolean[num];
      arr[tmp - 1] = true;
      
      for(int i = 0; i < event; i++) {
        st = new StringTokenizer(br.readLine());
        int a = Macro(st.nextToken()) - 1;
        int b = Macro(st.nextToken()) - 1;
        if(arr[a] || arr[b]) {
          arr[a] = true;
          arr[b] = true;
        }
      }

      for(int i = 0; i < num; i++) if(arr[i]) cnt++;
      sb.append(cnt).append("\n");
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}