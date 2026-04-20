import java.util.*; //24416(수학) 알고리즘 수업 - 피보나치 수 1
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static int Fb(int n) {
    int[] arr = new int[n + 1];
    arr[1] = arr[2] = 1;
    
    for(int i = 3; i <= n; i++) arr[i] = arr[i - 1] + arr[i - 2];
    return arr[n];
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine());
  
    bw.write(Fb(n) + " " + (n - 2));
    bw.close();
  }
}