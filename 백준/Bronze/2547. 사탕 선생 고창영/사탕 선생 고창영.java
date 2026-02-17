import java.io.*; //2547 사탕 선생 고창영

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    while(Test-- > 0) {
      br.readLine();
      int n = Integer.parseInt(br.readLine());
      long sum = 0;

      for(int j = 0; j < n; j++) {
        sum = (sum + (Long.parseLong(br.readLine())%n)) % n;
      }

      sb.append(sum==0 ? "YES\n" : "NO\n");
    }

    System.out.print(sb);
  }
}