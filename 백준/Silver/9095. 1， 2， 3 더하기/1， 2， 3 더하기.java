import java.util.*; //9095(dp) 1, 2, 3 더하기
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    int[] arr = new int[11];
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 4;
    
    for(int i = 3; i < 11; i++) {
      arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
    }

    while(Test-- > 0) sb.append(arr[Integer.parseInt(br.readLine()) - 1]).append('\n');
    bw.write(sb.toString());
    bw.close();
  }
}