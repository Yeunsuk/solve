import java.util.*; //16304(그리디) A Prize No One Can Win
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num = Macro(st.nextToken()), cnt = 1;
    int max = Macro(st.nextToken());
    int[] arr = new int[num];
    
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < num; i++) arr[i] = Macro(st.nextToken());
    Arrays.sort(arr);
    
    for(int i = 1; i < num; i++) {
      if(arr[i] + arr[i - 1] <= max) cnt++;
      else break;
    }
    
    bw.write(String.valueOf(cnt));
    bw.close();
  }
}