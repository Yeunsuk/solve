import java.util.*; //1812(수학) 사탕
import java.awt.Stroke;
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()) + 1, sum = 0, i;
    int[] arr = new int[n], rlt = new int[n];
    
    for(i = 1; i < n; i++) arr[i] = Macro(br.readLine());
    for(i = 1; i < arr.length; i++) {
      if(i % 2 == 0) sum -= arr[i];
      else sum += arr[i];
    }
    
    rlt[1] = sum / 2;
    for(i = 2; i < arr.length; i++) rlt[i] = arr[i - 1] - rlt[i - 1];
    for(i = 1; i < n; i++) bw.write(rlt[i] + "\n");
    bw.close();
  }
}