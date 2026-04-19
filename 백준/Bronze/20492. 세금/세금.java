import java.io.*; //20492 세금

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    System.out.print((int)(n*0.78) + " " + (int)(n*0.8 + (n*0.156)));
  }
}