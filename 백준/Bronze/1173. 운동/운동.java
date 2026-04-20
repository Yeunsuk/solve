import java.util.*; //1173(구현) 운동
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num = Macro(st.nextToken()), cnt = 0;
    int std = Macro(st.nextToken());
    int max = Macro(st.nextToken());
    int pus = Macro(st.nextToken());
    int mus = Macro(st.nextToken());
    int mix = std;

    if((max - std) < pus) bw.write("-1");
    else {
      while(true) {
        if((std + pus) <= max) {
          std += pus;
          num--;
        }else std -= mus;
        
        if(std < mix) std = mix;
        cnt++;

        if(num == 0) break;
      }
      
      bw.write(String.valueOf(cnt));
    }

    bw.close();
  }
}