import java.util.*; //2839번 설탕 배달
import java.io.*;

public class Main {
  public static int bonggi(int n) {
    int max = n / 5;
    int remain = 1; 
    int sum = 0;
    for(int i = 0; i <= max; i++) {
      if((n - i * 5) % 3 == 0) {
        remain = (n - i * 5);
        sum = i;
      }
    }
    if(remain % 3 == 0) {
      sum += remain / 3;
      return sum;
    } else return -1; 
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    br.close();
    System.out.print(bonggi(n));
  }
}