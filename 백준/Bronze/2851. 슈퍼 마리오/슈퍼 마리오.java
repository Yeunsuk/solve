import java.util.*; //2851(구현) 슈퍼 마리오 
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int std = 1000, rlt = 0, i;
    int[] arr = new int[11];

    for(i = 1; i <= 10;i++) arr[i] = arr[i-1] + Macro(br.readLine());
    for(i = 10; i > 0; i--) {
      int tmp = Math.abs(100 - arr[i]);
      if(std > tmp) {
        rlt = arr[i];
        std = tmp;
      }
    }
    
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}