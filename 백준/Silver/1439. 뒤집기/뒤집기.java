import java.util.*; //1439(그리디) 뒤집기
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      char[] arr = br.readLine().toCharArray();
      int[] cnt = new int[2];
      char std = arr[0];
      cnt[std - '0']++;
      
      for(int i = 1; i < arr.length; i++) {
        if(std != arr[i]) {
          cnt[arr[i] - '0']++;
          std = arr[i];
        }
      }
    
      bw.write(String.valueOf(Math.min(cnt[0], cnt[1])));
      bw.close();
  }
}