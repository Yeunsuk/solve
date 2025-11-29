import java.util.*; //25418(graphs) 정수 a를 k로 만들기
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken()), cnt = 0;
    int k = Integer.parseInt(st.nextToken());

    while(k > n) {
      if(k % 2 == 0 && k / 2 >= n) k /= 2;
      else k -= 1;
      cnt++;
    }
    
    System.out.print(cnt + n - k);
  }
}