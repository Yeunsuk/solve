import java.util.*; //2828(그리디) 사과 담기 게임
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    int siz = Macro(st.nextToken());
    int bar = Macro(st.nextToken());
    int num = Macro(br.readLine());
    int rt = bar, lt = 1, rlt = 0;

    for(int i = 0; i < num; i++) {
      int pos = Macro(br.readLine());

      if(lt <= pos && pos <= rt) continue;

      if(lt > pos) {
        rlt += (lt - pos);
        rt -= (lt - pos);
        lt = pos;
      }

      else{
        rlt += (pos - rt);
        lt += (pos - rt);
        rt = pos;
      }
    }

    bw.write(rlt + "");
    bw.flush();
  }
}