import java.util.*; //14656(구현) 조교는 새디스트야!!
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Macro(br.readLine()) + 1, cnt = 0;

    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 1; i < num; i++) if(i != Macro(st.nextToken())) cnt++;
    bw.write(String.valueOf(cnt));
    bw.close();
  }
}