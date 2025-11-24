import java.util.*; //13699(graphs) 점화식
import java.io.*;

public class Main {
  static int stoi(String s) { return Integer.parseInt(s); }
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    long[] arr = new long[36];
    arr[0] = 1;

    for(int i = 1; i < 36; i++) {
      long tmp = 0;
      
      for(int j = 0; j < i; j++) tmp += arr[j] * arr[i-1-j];
      arr[i] = tmp;
    }
    
    bw.write(String.valueOf(arr[num]));
    bw.close();
  }
}