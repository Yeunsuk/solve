import java.util.*; //16521(수학) A Symmetrical Pizza
import java.io.*;

public class Main {
  private static int Gcd(int a, int b) {
    while (b != 0) {
      int tmp = b;
      b = a % b;
      a = tmp;
    }
    
    return a;
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = (int)Math.round(Double.parseDouble(br.readLine()) * 100);
    int sum = 36000, gcd = Gcd(sum, num);
    bw.write(String.valueOf(sum / gcd));
    bw.close();
  }
}