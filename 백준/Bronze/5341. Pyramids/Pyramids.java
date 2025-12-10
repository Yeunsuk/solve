import java.util.*; //5341(구현) Pyramids
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    while(true) {
      int n = Integer.parseInt(br.readLine());
      if(n == 0) break;
      
      sb.append(n*(n+1)/2).append("\n");
    }

    bw.write(sb.toString());
    bw.close();
  }
}