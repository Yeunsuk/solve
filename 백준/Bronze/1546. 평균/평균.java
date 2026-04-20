import java.util.*; //1546(수학) 평균
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    
    int n = Macro(br.readLine());
    int arr[] = new int[n];
    long sum = 0, max = 0;

    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++) arr[i] = Macro(st.nextToken());
    for(int i = 0; i < n; i++) {
      if(max < arr[i]) max = arr[i];
      sum += arr[i];
     }
    
    bw.write(String.valueOf(sum * 100.0 / max / n));   
    bw.flush();
  }
}