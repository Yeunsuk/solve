import java.util.*; //1072(수학) 게임
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num = Integer.parseInt(st.nextToken());
    int win = Integer.parseInt(st.nextToken());

    long rate_w = (long)Math.floor((double)win * 100 / num);
    long rt = 1000000000; long rlt = -1; long lt = 1;
    
    while(lt <= rt) {
      long mid = (lt + rt) / 2; 
      long rate_n = (long)Math.floor((double)(win + mid)* 100 / (num + mid));

      if(rate_n > rate_w) {
        rt = mid - 1;
        rlt = mid;
      }else if(rate_n <= rate_w) lt = mid + 1;
    }
    System.out.println(rlt);
  }
}