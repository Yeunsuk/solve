import java.util.*; //9372(graphs) 상근이의 여행
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    while(Test-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      
      for(int i = 0; i < m; i++) br.readLine();
      sb.append(n-1).append("\n");
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}