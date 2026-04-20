import java.util.*; //28282(수학) 운명
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Macro(st.nextToken()), i;
    int k = Macro(st.nextToken());
    int[] std = new int[k];
    int[] arr = new int[k];
    long cnt = 0;
    
    st = new StringTokenizer(br.readLine());
    for(i = 0; i < n; i++) std[Macro(st.nextToken()) - 1]++;
    for(i = n; i < 2 * n; i++) arr[Macro(st.nextToken()) - 1]++;

    for(i = 0; i < k; i++) {
      int tmp = 0;
      
      for(int j = 0; j < k; j++) if(i != j) tmp += std[j];
      cnt += (long)arr[i] * (long)tmp;
    }
    
    bw.write(String.valueOf(cnt));
    bw.close();
  }
}