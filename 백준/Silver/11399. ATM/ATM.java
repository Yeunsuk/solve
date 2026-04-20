import java.util.*; //11399(그리디) ATM
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    StringTokenizer st;
    int rlt = 0;

    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
    Arrays.sort(arr);
    br.close();
    
    for(int i = 0; i < n; i++) rlt += arr[i] * (n - i);
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}