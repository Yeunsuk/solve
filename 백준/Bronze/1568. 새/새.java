import java.io.*; //1568 새

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine()), cnt=0, k=1;

    while(n != 0) {
      if(k > n) k=1;
      n -= k++;
      cnt++;
    }

    System.out.print(cnt);
  }
}