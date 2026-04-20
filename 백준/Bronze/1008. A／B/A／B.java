import java.util.*; //1008(수학) A/B
import java.io.*;

public class Main {
  static double Macro(String str) {
    return Double.parseDouble(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    bw.write(String.valueOf(Macro(st.nextToken()) / Macro(st.nextToken()))); 
    bw.close();
  }
}