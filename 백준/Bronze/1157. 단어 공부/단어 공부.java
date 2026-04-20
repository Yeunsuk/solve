import java.util.*; //1157(문자열) 단어 공부
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String arr = br.readLine().toUpperCase();
    int[] cnt = new int[26];
    char rlt = '?';
    int ht = 0;

    for(int i = 0; i < arr.length(); i++) {
      int num = arr.charAt(i) -'A';
      cnt[num]++;
    }

    for (int i = 0; i < cnt.length; i++) {
      if(ht < cnt[i]) {
        rlt = (char)(i + 'A');
        ht = cnt[i];
      }else if(ht == cnt[i]) rlt = '?';
    }
    
    bw.write(rlt);
    bw.close();
  }
}