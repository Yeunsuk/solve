import java.util.*; //10431(구현) 줄세우기
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()), cnt = 0;
    StringTokenizer st;

    for(int i = 1; i < n + 1; i++) {
      st = new StringTokenizer(br.readLine());
      int[] arr = new int[20];
      st.nextToken();
      cnt = 0;
      
      for(int j = 0; j < 20; j++) arr[j] = Macro(st.nextToken());
      for(int j = 0; j < 20; j++) for(int k = 0; k < j; k++) if(arr[k] > arr[j]) cnt++;
      bw.write(i + " " + cnt + "\n");
    }
    
    bw.close();
  }
}