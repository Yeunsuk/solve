import java.util.*; //1500(수학) 최대 곱
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int sum = Integer.parseInt(st.nextToken());
    int cnt = Integer.parseInt(st.nextToken());
    int div = sum / cnt; int rst = sum % cnt;
    
    long max = 1;
    for (int i = 1; i <= cnt; i++) {
      if(i <= rst) max *= (div+1);
      else max *= div;
    }
    
    System.out.print(max);
  }
}