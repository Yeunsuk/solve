import java.util.*; //1475(구현) 방 번호
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int[] cnt = new int[9];
    br.close();

    for(int i = 0; i < str.length(); i++) {
      int n = str.charAt(i) - '0';
      if(n == 9) n = 6;
      cnt[n]++;
    }

    cnt[6] = cnt[6] / 2 + cnt[6] % 2;
    Arrays.sort(cnt);
    
    bw.write(String.valueOf(cnt[8]));
    bw.close();
  }
}