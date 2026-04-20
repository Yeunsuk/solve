
import java.util.*; //1074(분할 정복) Z
import java.io.*;

public class Main {
  static int[] arr = new int[3];
  static int sum = 0;

  static void Macro(int y, int x, int n) {
    
    if(n == 0) {
      if(y == 1) sum += 2;
      if(x == 1) sum++;
      System.out.print(sum);
      return;
    }
    
    int range = (int) Math.pow(4, n - 1);
    int std = (int) Math.pow(2, n - 1);
    
    if(y >= std) {
      sum += 2 * range;
      y -= std;
    }
    
    if(x >= std) {
      sum += range;
      x -= std;
    }
    
    n--;
    Macro(y, x, n);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < 3; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    br.close();
    Macro(arr[1], arr[2], arr[0]);
  }
}