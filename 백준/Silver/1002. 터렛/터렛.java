import java.util.*; // 1002 터렛
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    int[] n = new int[6];
    int test = Integer.parseInt(br.readLine());
    for(int i = 0; i < test; i++) {
      st = new StringTokenizer(br.readLine()," ");
      for(int j = 0; j < 6; j++) {
        n[j] = Integer.parseInt(st.nextToken());
      }
      double range = (n[0] - n[3]) * (n[0] - n[3]) + (n[1] - n[4]) * (n[1] - n[4]);
      double r = (n[2] + n[5]) * (n[2] + n[5]);
      double r_ = (n[2] - n[5]) * (n[2] - n[5]);

      if(n[0] - n[3] == 0 && n[1] - n[4] == 0) {
        if(n[2] == n[5]) sb.append("-1\n");
        else sb.append("0\n");
      }else {
        if(range > r) sb.append("0\n");
        else if(r == range) sb.append("1\n");
        else if(r_ > range) sb.append("0\n");
        else if(r_ == range) sb.append("1\n");
        else sb.append("2\n");
      } 
    }
    System.out.println(sb);
  }
}