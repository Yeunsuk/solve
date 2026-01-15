import java.io.*; //8558(구현) Silnia

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine()), rlt = 1;
    for(int i=2; i<=n; i++) rlt *= i;
    rlt %= 10;
      
    System.out.print(rlt);
  }
}