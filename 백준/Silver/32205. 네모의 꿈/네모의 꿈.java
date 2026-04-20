import java.util.*; //32205(기하학) 네모의 꿈
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean[] arr = new boolean[1000000];
    int n = Macro(br.readLine());
    boolean std = false;
    StringTokenizer st;
    
    while(n-- > 0) {
      st = new StringTokenizer(br.readLine());

      for(int i = 0; i < 3; i++) {
        int tmp = Macro(st.nextToken());

        if(!arr[tmp - 1]) arr[tmp - 1] = true;
        else {
          std = true;
          break;
        }
      }
    }
            
    if(!std) bw.write("0");
    else bw.write("1");
    bw.close();
  }
}