import java.util.*; //13909(수학) 창문 닫기
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int cnt = 0, i = 1;
    br.close();
    
    for(; i * i <= n; i++) cnt++;
    bw.write(cnt + "");
    bw.flush();
  }
}