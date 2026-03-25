import java.io.*; //11183 한글 2

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char n = br.readLine().charAt(0);
    System.out.print((int)n-44031);
  }
}