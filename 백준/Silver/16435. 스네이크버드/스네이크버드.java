import java.util.*; //16435(그리디) 스네이크버드
import java.io.*;

public class Main {
  private static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Macro(st.nextToken());
    int s = Macro(st.nextToken());
    int[] arr = new int[n];

    st = new StringTokenizer(br.readLine());
    br.close();
    
    for(int i = 0; i < n; i++) arr[i] = Macro(st.nextToken());
    Arrays.sort(arr);
    
    for (int i = 0; i < n; i++) {
      if(arr[i] > s) break;
      s++;
    }

    bw.write(s + "");
    bw.close();
  }
}