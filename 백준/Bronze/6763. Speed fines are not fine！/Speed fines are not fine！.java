import java.util.*; //6763(구현) Speed fines are not fine!
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine()) - Integer.parseInt(br.readLine());
    
    if(n >= 0) System.out.print("Congratulations, you are within the speed limit!");
    else System.out.print("You are speeding and your fine is $" + (n >= -20 ? 100 : n >= -30 ? 270 : 500) + ".");
  }
}