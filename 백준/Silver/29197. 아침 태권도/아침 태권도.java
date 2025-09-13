import java.util.*; // 29197(기하학) 아침 태권도
import java.io.*;

public class Main {  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    Set<Long> set = new HashSet<>();
    
    for (int i = 0; i < num; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      double x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      double tmp = Math.atan2(y, x);
      
      long rlt = Math.round(tmp * 1e9);
      set.add(rlt);
    }
    
    bw.write(String.valueOf(set.size()));
    bw.close();
  }
}