import java.util.*; //13118(구현) 뉴턴과 사과
import java.io.*; //10269(구현)Train Passengers

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int max_num = Macro(st.nextToken()), people = 0;
    int station = Macro(st.nextToken());
    boolean std = true;

    for(int i = 0; i < station; i++) {
      st = new StringTokenizer(br.readLine());
      people -= Macro(st.nextToken());
      if(people < 0) std = false;
      people += Macro(st.nextToken());
      if(people > max_num) std = false;
      
      if(Macro(st.nextToken()) > 0 && people < max_num) std = false;
    }

    if(people != 0) std = false;
    
    bw.write(std ? "possible" : "impossible");
    bw.close();
  }
}