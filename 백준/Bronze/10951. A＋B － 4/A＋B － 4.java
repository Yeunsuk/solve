import java.util.*; //10951(구현) A+B - 4
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String str;
    
    while((str = br.readLine()) != null) {
      StringTokenizer st = new StringTokenizer(str);
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      sb.append(a + b).append("\n");
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}
