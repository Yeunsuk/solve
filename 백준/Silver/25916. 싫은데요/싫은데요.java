import java.util.*; //25916(두 포인터) 싫은데요
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int sum = 0, rlt = 0, a = 0;
    int[] arr = new int[n];
  
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

    for(int i = 0; i < n; i++) {
      sum += arr[i];
      
      while(sum > m) sum -= arr[a++];
      rlt = Math.max(rlt, sum);
    }
    
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}