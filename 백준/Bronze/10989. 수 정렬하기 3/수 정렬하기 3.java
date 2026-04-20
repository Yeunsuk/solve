import java.util.*; //10989(정렬) 수 정렬하기 3
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine());
    int arr[] = new int[10_001];

    for(int i = 0; i < n; i++) arr[Macro(br.readLine())]++;
    for(int i = 1; i < 10_001; i++) {
      while(arr[i] > 0) {
        bw.write(i + "\n");
        arr[i]--;
      }
    }

    bw.close();
  }
}