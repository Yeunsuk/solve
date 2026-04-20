import java.util.*; //10709(구현) 기상캐스터
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    int ud = Macro(st.nextToken());
    int rl = Macro(st.nextToken());
    int cnt;
    
    for(int i = 0; i < ud; i++){
      String str = br.readLine();
      cnt = -1;
      
      for(int j = 0; j < rl; j++){
        if(str.charAt(j) == 'c') {
          sb.append("0 ");
          cnt = j;
        }else if(cnt == -1) sb.append(-1 + " ");
        else sb.append(j - cnt + " ");
      }
      sb.append("\n");
    }

    bw.write(sb.toString());
    bw.close();
  }
}