import java.util.*; //10797(구현) 10부제
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine()), cnt = 0;
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < 5; i++) if(num == Integer.parseInt(st.nextToken())) cnt++;

    bw.write(String.valueOf(cnt));
    bw.close();
  }
}