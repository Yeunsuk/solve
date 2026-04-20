import java.util.*; //14729(정렬) 칠무해
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[100001];
    int cnt = 0; int i;
    
    for(i = 0; i < n; i++) arr[(int)(Double.parseDouble(br.readLine()) * 1000)]++;
    
    for(i = 0; i < arr.length; i++) {
      while(arr[i] > 0 && cnt < 7) {
        double tmp = i / 1000.0;
        bw.write(String.format("%.3f\n", tmp));
        arr[i]--;
        cnt++;
      }
    }
    
    bw.close();
  }
}