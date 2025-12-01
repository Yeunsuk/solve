import java.util.*; //(graphs) Bookshelf 2
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int min = Integer.MAX_VALUE, tmp;
    int arr[] = new int[n];

    for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
    
    for(int i = 1; i < (1 << n); i++) {
      tmp = 0;
      
      for(int j = 0; j < n; j++) if((i & (1 << j)) != 0) tmp += arr[j];
      if(tmp >= m) min = Math.min(min, tmp - m);
    }

    bw.write(String.valueOf(min));
    bw.close();
  }
}