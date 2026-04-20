import java.util.*; //9655(dp) 돌 게임
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(br.readLine());
    if(num % 2 == 0) System.out.print("CY");
    else System.out.print("SK");
  }
}