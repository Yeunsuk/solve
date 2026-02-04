import java.util.*; //2501(구현) 약수 구하기
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken()), rlt = 0;
    int k = Integer.parseInt(st.nextToken()), cnt = 0;

    for(int i=1; i <= n; i++) {
      if(n%i == 0) cnt++;
      
      if(cnt==k) {
        rlt=i;
        break;
      }
    }
    
    System.out.print(rlt);
  }
}