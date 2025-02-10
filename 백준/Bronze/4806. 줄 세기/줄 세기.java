import java.util.*; //4806(구현) 줄 세기
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = null;
    int cnt = 0;
    
    while((str = br.readLine()) != null) cnt++;
    bw.write(String.valueOf(cnt));
    bw.close();
  }
}