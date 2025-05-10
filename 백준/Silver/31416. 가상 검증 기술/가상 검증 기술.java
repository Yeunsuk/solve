import java.util.*; //31416(수학) 가상 검증 기술
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    while(Test-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int t_a = Integer.parseInt(st.nextToken());
      int t_b = Integer.parseInt(st.nextToken());
      int c_a = Integer.parseInt(st.nextToken());
      int c_b = Integer.parseInt(st.nextToken());
      int rlt = t_b * c_b;

      if(t_a * c_a > rlt) {
        int tmp = rlt / t_a + 1;
        int leave = c_a - tmp;
        int lee = leave / 2;
        
        if(leave % 2 == 0) rlt = t_a * lee + t_a * tmp;
        else rlt = Math.min(rlt + (lee + 1) * t_a, t_a * tmp + (lee + 1) * t_a);
      }
      sb.append(rlt).append("\n");
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}