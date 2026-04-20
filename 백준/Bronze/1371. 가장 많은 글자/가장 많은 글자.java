import java.util.*; //1371(문자열) 가장 많은 글자
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[26];
    String str, tmp = "";
    
    while((str = br.readLine()) != null) tmp += str;
    int max = 0;
    
    for(int i = 0; i < tmp.length(); i++) {
      if(tmp.charAt(i) != ' ') {
        arr[tmp.charAt(i) - 'a']++;
        if(arr[tmp.charAt(i) - 'a'] > max) max = arr[tmp.charAt(i) - 'a'];
      }
    }

    for(int i = 0; i < 26; i++) if(max == arr[i]) bw.write(String.valueOf((char)(i + 'a')));
    bw.close();
  }
}