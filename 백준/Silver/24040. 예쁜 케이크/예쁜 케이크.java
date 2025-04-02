import java.util.*; //24040(수학) 예쁜 케이크
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    while(Test-- > 0) {
      long tmp = Long.parseLong(br.readLine());
      if((tmp % 9 == 0) || (tmp % 3 == 2)) sb.append("TAK\n");
      else sb.append("NIE\n");
    }

    bw.write(sb.toString());
    bw.close();
  }
}