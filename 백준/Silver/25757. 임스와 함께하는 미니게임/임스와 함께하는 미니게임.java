import java.util.*; //25757(자료구조) 임스와 함께하는 미니게임
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    HashSet<String> hs = new HashSet<>();
    int n = Macro(st.nextToken());
    String std = st.nextToken();
    int tmp = 0, i = 0;

    if(std.equals("Y")) tmp = 1;
    else if(std.equals("F")) tmp = 2;
    else if(std.equals("O")) tmp = 3;
    for(; i < n; i++) hs.add(br.readLine());
    
    bw.write(String.valueOf(hs.size() / tmp));
    bw.close();
  }
}