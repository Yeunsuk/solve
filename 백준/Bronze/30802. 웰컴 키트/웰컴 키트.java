import java.util.*; //30802(수학) 웰컴 키트
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine()), sum = 0;
    int[] arr = new int[6];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < 6; i++) arr[i] = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int t = Integer.parseInt(st.nextToken());
    int p = Integer.parseInt(st.nextToken());

    for (int i = 0; i < 6; i++) {
      int tmp = arr[i];
      
      if(tmp == 0) continue;
      else if (tmp <= t) sum += 1;
      else if (tmp % t == 0) sum += tmp / t;
      else sum += (tmp / t) + 1;
    }
    
    bw.write(sum + "\n" + (num / p) + " " + (num % p));
    bw.close();
  }
}