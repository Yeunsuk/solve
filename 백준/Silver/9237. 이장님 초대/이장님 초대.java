import java.util.*; //9237(그리디) 이장님 초대
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine());
    int max = 0;
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    Integer arr[] = new Integer[n];
    
    for(int i = 0; i < n; i++) arr[i] = Macro(st.nextToken());
    Arrays.sort(arr, Collections.reverseOrder());

    for(int i = 0; i < n; i++) max = Math.max(max, arr[i] + i + 1);
    bw.write(String.valueOf(++max));
    bw.close();
  }
}