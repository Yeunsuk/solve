import java.util.*; //10952(구현) A+B - 5
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    while(true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int tmp = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
      if(tmp == 0) break;
      
      sb.append(tmp).append("\n");
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}