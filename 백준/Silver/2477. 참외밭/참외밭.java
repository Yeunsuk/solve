import java.util.*; //2477(기하학) 참외밭
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int hgh = 0, wdh = 0, ph = 0, pw = 0;
    int rlt = Macro(br.readLine());
    int[] fst = new int[6];
    int[] sec = new int[6];
    StringTokenizer st;
    
    for(int i = 0; i < 6; i++) {
      st = new StringTokenizer(br.readLine());
      fst[i] = Macro(st.nextToken());
      sec[i] = Macro(st.nextToken());
      
      if(fst[i] == 1 || fst[i] == 2) {
        if(hgh < sec[i]) {
          hgh = sec[i];
          ph = i;
        }
      }else {
        if(wdh < sec[i]) {
          wdh = sec[i];
          pw = i;
        }
      }
    }
    
    rlt *= wdh * hgh - sec[(pw + 3) % 6] * sec[(ph + 3) % 6];
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}