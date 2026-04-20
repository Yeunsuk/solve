import java.util.*; //15688(정렬) 수 정렬하기 5
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()), i = 0;
    int[] arr = new int[n];

    for(; i < n; i++) arr[i] = Macro(br.readLine());
    Arrays.sort(arr);
    br.close();

    for(i = 0; i < n; i++) bw.write(arr[i] + "\n");
    bw.close();
  }
}