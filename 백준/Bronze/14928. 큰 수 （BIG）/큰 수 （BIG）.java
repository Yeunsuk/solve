import java.io.*; //14928 큰 수 (BIG)

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    long num = 0;

    for(int i = 0; i < str.length(); i++) num = (num * 10 + (str.charAt(i) - '0')) % 20000303;
    System.out.print(num);
  }
}