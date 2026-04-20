import java.util.*; //16208(그리디) 귀찮
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()), i, sum = 0;
    int[] arr = new int[n];
    long rlt = 0;
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(i = 0; i < n; i++) {
      int tmp = Macro(st.nextToken());
      arr[i] = tmp;
      sum += tmp;
    }
    
    Arrays.sort(arr);
    for(i = 0; i < n; i++) {
      int tmp = arr[i];
      rlt += (sum - tmp) * tmp;
      sum -= tmp;
    }
    
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}