import java.util.*; //1417(그리디) 국회의원 선거
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()) - 1, cnt = 0;
    int std = Macro(br.readLine());
    Integer[] arr = new Integer[n];

    if(n != 0) {
      for(int i = 0; i < n; i++) arr[i] = Macro(br.readLine());
      Arrays.sort(arr, Collections.reverseOrder());
  
      while(std <= arr[0]) {
        int tmp = 1;
        
        for(int i = 1; i < n; i++) if(arr[0] == arr[i]) tmp++;
        if(std + tmp > arr[0]) {
          cnt += arr[0] - std + 1;
          break;
        }else {
          cnt += tmp;
          std += tmp;
  
          for(int i = 0; i < tmp; i++) arr[i]--;
        }
      }
    }

    bw.write(String.valueOf(cnt));
    bw.close();
  }
}