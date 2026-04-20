import java.util.*; //14730(수학) 謎紛芥索紀 (Small)
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()), rlt = 0;
    StringTokenizer st;

    while(n-- > 0) {
      st = new StringTokenizer(br.readLine());
      rlt += Macro(st.nextToken()) * Macro(st.nextToken());
    }
    
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}