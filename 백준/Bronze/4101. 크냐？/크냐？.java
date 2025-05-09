import java.util.*; //4101(구현) 크냐?
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    while(true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      if(a == 0 && b == 0) break;
      
      sb.append(a > b ? "Yes\n" : "No\n");
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}