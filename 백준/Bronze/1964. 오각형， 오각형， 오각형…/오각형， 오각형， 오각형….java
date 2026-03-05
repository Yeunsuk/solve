import java.io.*; //1964 오각형, 오각형, 오각형…

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long n = Long.parseLong(br.readLine());
    
    System.out.print((5 + (n-1) * (3*n+8) / 2) % 45678);
  }
}