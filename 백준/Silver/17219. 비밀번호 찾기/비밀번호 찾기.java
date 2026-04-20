import java.util.*; //17219(자료구조) 비밀번호 찾기 
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    Map<String, String> map = new HashMap<>();
    int n = Macro(st.nextToken()), i;
    int m = Macro(st.nextToken());

    for(i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      map.put(st.nextToken(), st.nextToken());
    }
    
    for(i = 0; i < m; i++) bw.write(map.get(br.readLine()) + "\n");
    bw.close();
  }
}