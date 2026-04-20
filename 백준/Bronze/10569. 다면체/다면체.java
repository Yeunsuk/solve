import java.util.*; //10569(기하학) 다면체
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Macro(br.readLine());
    StringTokenizer st;

    while(Test-- > 0) {
      st = new StringTokenizer(br.readLine());
      int p = Macro(st.nextToken());
      int s = Macro(st.nextToken());

      bw.write(s - p + 2 + "\n");
    }
    
    bw.close();
  }
}