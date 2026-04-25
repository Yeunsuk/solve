import java.io.*; //8871 Zadanie próbne 2

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    System.out.print((n+1)*2 + " " + (n+1)*3);
  }
}