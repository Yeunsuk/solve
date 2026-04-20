import java.util.*; //3135(그리디) 라디오
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int std = Macro(st.nextToken());
    int tgt = Macro(st.nextToken());
    int rlt = Math.abs(std - tgt);
    int n = Macro(br.readLine());
    
    for(int i = 0; i < n; i++) rlt = Math.min(Math.abs(tgt - Macro(br.readLine())) + 1, rlt);
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}