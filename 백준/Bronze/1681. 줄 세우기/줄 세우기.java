import java.io.*; //1681 줄 세우기
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken()), rlt=1, cnt=0;
    String std = st.nextToken();
    
    while(cnt != n) {
      if((rlt++ + "").contains(std)) continue;
      cnt++;
    }
    
    System.out.print(rlt-1);
  }
}