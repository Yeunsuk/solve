import java.io.*; //9316(구현) Hello World, Judge

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    for(int i = 1; i <= n; i++) sb.append("Hello World, Judge ").append(i).append("!\n");
    System.out.print(sb);
  }
}