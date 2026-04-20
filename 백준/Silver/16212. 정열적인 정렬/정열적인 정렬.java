import java.util.*; //16212(정렬) 정열적인 정렬
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

    for(int i = 0; i < n; i++) bw.write(arr[i] + " ");
    bw.close();
  }
}