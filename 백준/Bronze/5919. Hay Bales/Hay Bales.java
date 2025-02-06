import java.util.*; //5919(수학) Hay Bales
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Macro(br.readLine()), sum = 0, rlt = 0;
    int[] arr = new int[num];
    
    for(int i = 0; i < num; i++) {
      int tmp = Macro(br.readLine());
      arr[i] = tmp;
      sum += tmp;
    }

    sum /= num;
    for(int i = 0; i < num; i++) rlt += Math.abs(arr[i] - sum);
    bw.write(String.valueOf(rlt / 2));
    bw.close();
  }
}