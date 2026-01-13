import java.io.*; //1550(구현) 16진수

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(Integer.parseInt(br.readLine(), 16));
  }
}