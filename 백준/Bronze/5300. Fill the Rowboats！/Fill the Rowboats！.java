import java.util.*; //5300(graphs) Fill the Rowboats!
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());

    for(int i = 1; i <= n; i++) {
      sb.append(i).append(" ");
      if(i % 6 == 0 || i == n) sb.append("Go! ");
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}