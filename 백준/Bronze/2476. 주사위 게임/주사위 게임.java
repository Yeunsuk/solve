import java.io.*; //2476 주사위 게임
import java.util.*;

public class Main {
  static int stoi(String s) {
    return Integer.parseInt(s);
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = stoi(br.readLine()), max=0, sum=0;
    
    for(int i=0; i<n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = stoi(st.nextToken());
      int b = stoi(st.nextToken());
      int c = stoi(st.nextToken());
      
      if(a==b && b==c) sum = 10000 + a*1000;
      else if(a==b) sum = 1000 + a*100;
      else if(b==c) sum = 1000 + b*100;
      else if(c==a) sum = 1000 + c*100;
      else sum = Math.max(a, Math.max(b,c))*100;
        
      max = Math.max(max, sum);
    }
    
    System.out.print(max);
  }
}