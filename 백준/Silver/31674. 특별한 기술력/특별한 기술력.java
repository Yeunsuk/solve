import java.util.*; //31674(그리디) 특별한 기술력
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int[] arr = new int[num];
    int div = 1_000_000_007;
    long sum = 0;
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < num; i++) arr[i] = Integer.parseInt(st.nextToken());
    Arrays.sort(arr);
    
    sum = arr[num - 1];
    for(int i = num - 2; i >= 0; i--) sum = (sum * 2 + arr[i]) % div;
    bw.write(String.valueOf(sum));
    bw.close();
  }
}