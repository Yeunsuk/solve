import java.util.*; //11727(DP) 2×n 타일링 2
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int[] arr = new int[1001];
    arr[1] = 1; arr[2] = 3;
    
    for(int i = 3; i <= num; i++) arr[i] = (arr[i-1] + 2 * arr[i-2]) % 10007;
    bw.write(String.valueOf(arr[num]));
    bw.close();
  }
}