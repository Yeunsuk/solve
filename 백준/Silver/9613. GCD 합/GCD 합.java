import java.util.*; //9613(수학) GCD 합
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static long Cul(int a, int b) {
    while(b > 0) {
      int t = a % b;
      a = b;
      b = t;
    }
    
    return a;
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine());
    long cnt = 0;

    for(int i = 0; i < n; i++) {
      String arr[] = br.readLine().split(" ");
      cnt = 0;
      
      for(int j = 1; j < arr.length; j++) {
        for (int k = j + 1; k < arr.length; k++) cnt += Cul(Math.max(Macro(arr[j]), Macro(arr[k])), Math.min(Macro(arr[j]), Macro(arr[k])));
      }
      
      bw.write(cnt + "\n");
    }
    
    bw.close();
  }
}