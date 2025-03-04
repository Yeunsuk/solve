import java.util.*; //2845(수학) 파티가 끝나고 난 뒤
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int std = Macro(st.nextToken()) * Macro(st.nextToken());
    StringBuilder sb = new StringBuilder();

    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < 5; i++) {
      sb.append(Macro(st.nextToken()) - std).append(" ");
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}