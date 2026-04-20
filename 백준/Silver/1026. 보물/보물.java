import java.util.*; //1026(그리디) 보물
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int num = Integer.parseInt(br.readLine());
    int[] low_a = new int[num];
    int[] low_b = new int[num];
    
    st = new StringTokenizer(br.readLine()," ");
    for(int i = 0; i < num; i++) {
      low_a[i] = Integer.parseInt(st.nextToken());
    }

    st = new StringTokenizer(br.readLine()," ");
    for(int i = 0; i < num; i++) {
      low_b[i] = Integer.parseInt(st.nextToken());
    }
    
    br.close();
    int result = 0;
    Arrays.sort(low_a);
    Arrays.sort(low_b);
    for(int i = 0; i < num; i++) {
      result += low_a[i] * low_b[num-i-1];
    }

    System.out.print(result);
  }
} 