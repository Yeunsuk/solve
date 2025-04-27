import java.util.*; //6511(수학) Black and white painting
import java.io.*;

public class Main {  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    while(true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int y = Integer.parseInt(st.nextToken());
      int x = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
      if(y == 0 && x == 0 && c == 0) break;
      int tmp = (y - 7) * (x - 7);
      
      sb.append(c == 1 ? ((tmp + 1) / 2) : (tmp / 2)).append('\n');
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}