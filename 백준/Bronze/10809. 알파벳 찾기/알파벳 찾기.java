import java.util.*; //10809(문자열) 알파벳 찾기
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    int[] arr = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    
    for(int i = 0; i < str.length(); i++) {
      char t = str.charAt(i);
      if(arr[t - 'a'] == -1) arr[t - 'a'] = i;
    }

    for(int tmp : arr) bw.write(tmp + " ");
    bw.close();
  }
}