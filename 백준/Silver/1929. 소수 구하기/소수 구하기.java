import java.util.*; //1929(수학) 소수 구하기
import java.io.*;

public class Main {
  static boolean[] check;
    
    static void Prime(int n) {
      
      check = new boolean[n+1];
      check[0] = check[1] = false;
      
      for(int i = 2; i < check.length; i++) {
        check[i] = true;
      }

      for(int i = 2; i <= Math.sqrt(n); i++) {
        if(check[i]) {
          for(int j = i * i; j <= n; j += i) check[j] = false;
        }
      }
    }

  
  public static void main(String[] args) throws IOException{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    st = new StringTokenizer(br.readLine());
    int m = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());
    br.close();

    Prime(n);
    for(int i = m; i < n + 1; i++) {
      if(check[i]) sb.append(i + "\n");
    }

    System.out.print(sb);
  } 
}