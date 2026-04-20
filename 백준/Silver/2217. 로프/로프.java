import java.util.*; //2217(그리디) 로프
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()), rlt = 0, i;
    Integer[] arr = new Integer[n];
    
    for(i = 0; i < n; i++) arr[i] = Macro(br.readLine());
    Arrays.sort(arr, Collections.reverseOrder());

    for(i = 0; i < n; i++) rlt = Math.max(rlt, arr[i] * (i + 1));
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}