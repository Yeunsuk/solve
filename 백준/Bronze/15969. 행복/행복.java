import java.util.*; //15969(구현) 행복
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine());
    int[] arr = new int[n];
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++) arr[i] = Macro(st.nextToken());
    Arrays.sort(arr);

    
    bw.write(String.valueOf(arr[arr.length - 1] - arr[0]));
    bw.close();
  }
}