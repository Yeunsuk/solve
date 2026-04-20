import java.util.*; //28324(그리디) 스케이트 연습
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()), tmp = 1;
    int[] arr = new int[n];
    long rlt = 1;
    
    StringTokenizer st= new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++) arr[i] = Macro(st.nextToken());
    for(int i = n - 2; i > -1; i--) {
      if(tmp > arr[i]) tmp = arr[i];
      else if(tmp < arr[i]) tmp++;
      rlt += tmp;
    }
    
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}