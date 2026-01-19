import java.io.*; //6887(구현) Squares

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    System.out.printf("The largest square has side length %d.", (int)Math.sqrt(n));
  }
}