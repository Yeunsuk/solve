import java.util.*; //4589(구현) Gnome Sequencing
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    sb.append("Gnomes:\n");
    
    while(Test-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
      
      sb.append((a > b && b > c || a < b && b < c) ? "Ordered\n" : "Unordered\n");
    }

    bw.write(sb.toString());
    bw.close();
  }
}