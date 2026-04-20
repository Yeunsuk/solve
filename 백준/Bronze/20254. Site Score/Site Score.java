import java.util.*; //20254(수학) Site Score
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    bw.write(String.valueOf((Macro(st.nextToken()) * 56) + (Macro(st.nextToken()) * 24) + (Macro(st.nextToken()) * 14) + (Macro(st.nextToken()) * 6)));
    bw.close();
  }
}