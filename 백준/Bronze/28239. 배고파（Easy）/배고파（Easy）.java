import java.util.*; //28239(수학) 배고파(Easy)
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    
    while(Test-- > 0) {
      long tmp = Long.parseLong(br.readLine());
      boolean std = false;
      
      for(int i = 0; i < tmp; i++) {
        if(std) break;
        long x = tmp - (1L << i);

        for(int j = 0; j < tmp; j++) {
          if(std) break;
          if(x == (1L << j)) {
            sb.append(i).append(" ").append(j).append("\n");
            std = true;
          }
          else if(x < (1L << j)) break;
        }
      }
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}