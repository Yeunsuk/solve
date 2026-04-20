import java.util.*; //11536(구현) 줄 세우기
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()), s = 0;
    String[] arr = new String[n];
    
    for(int i = 0; i < n; i++) arr[i] = br.readLine();
    for(int i = 0; i < n - 1; i++) {
      if(arr[i].compareTo(arr[i + 1]) > 0) s++;
      else s--;
    }
    
    if(s == n - 1) bw.write("DECREASING");
    else if(s == 1 - n) bw.write("INCREASING");
    else bw.write("NEITHER");
    bw.close();
  }
}