import java.io.*; //6888 Terms of Office

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    while(a <= b) {
      sb.append("All positions change in year ").append(a).append('\n');
      a+=60;
    }
    
    System.out.print(sb);
  }
}