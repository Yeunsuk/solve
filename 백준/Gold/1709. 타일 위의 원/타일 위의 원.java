import java.util.*; // 1709(기하학) 타일 위의 원
import java.io.*;

public class Main {
  static long dist(long x, long y) {
      return x * x + y * y;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long num = Integer.parseInt(br.readLine());
    long y = num / 2 - 1, x = 0, cnt = 0;
    long r = (num / 2) * (num / 2);

    while(x <= num / 2 && y >= 0) {
      long tmp = dist(x + 1, y);
      if(tmp <= r) x++;
      if(tmp >= r) y--;
      cnt++;
    }
    
    System.out.println(cnt * 4);
  }
}