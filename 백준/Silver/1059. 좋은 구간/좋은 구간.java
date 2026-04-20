import java.util.*; //1059(수학) 좋은 구간
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine());
    int[] arr = new int[n];

    StringTokenizer st = new StringTokenizer(br.readLine());
    int std = Macro(br.readLine());
    int mn = 0, mx =1000;
    
    for(int i = 0; i < n; i++) {
      arr[i] = Macro(st.nextToken());
      
      if(std < arr[i]) mx = Math.min(mx, arr[i]);
      else if(std > arr[i]) mn = Math.max(mn, arr[i]);
      else {
        bw.write("0");
        bw.close();
        return;
      }
    }

    mx--;
    mn++;
    int tmp = (mx - std + 1) * (std - mn) + mx - std;
    bw.write(String.valueOf(tmp));
    bw.close();
  }
}