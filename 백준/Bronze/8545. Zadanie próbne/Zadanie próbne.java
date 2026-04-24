import java.io.*; //8545 Zadanie próbne

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print(new StringBuilder(br.readLine()).reverse());
  }
}