import java.util.*; //30700(그리디) KOREA 문자열 만들기
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] arr = {'K', 'O', 'R', 'E', 'A'};
    String str = br.readLine();
    int cnt = 0;
    
    for(int i = 0; i < str.length(); i++) {
      char tmp = str.charAt(i);
      if(tmp == arr[cnt % 5]) cnt++;
    }

    bw.write(String.valueOf(cnt));
    bw.close();
  }
}