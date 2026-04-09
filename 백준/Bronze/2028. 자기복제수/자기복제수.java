import java.io.*; //2028 자기복제수

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    while(Test-->0) {
      int n = Integer.parseInt(br.readLine()), num = n*n;
      boolean std = false;
      
      while(n!=0) {
        int a = n%10, b = num%10;
        if(a!=b) {
          sb.append("NO\n");
          std = true;
          break;
        }
        
        num/=10;
        n/=10;
      }
      
      if(!std) sb.append("YES\n");
    }
    
    System.out.print(sb);
  }
}