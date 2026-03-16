import java.io.*; //11282 한글

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.print((char)(Integer.parseInt(br.readLine())+44031));
  }
}