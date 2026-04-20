import java.util.*; //1269(자료구조) 대칭 차집합
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Macro(st.nextToken()), cnt = 0;
    int b = Macro(st.nextToken()), i;

    Set<Integer> set = new HashSet<>();
    st = new StringTokenizer(br.readLine());
    for(i = 0; i < a; i++) set.add(Macro(st.nextToken()));
    
    st = new StringTokenizer(br.readLine());
    for(i = 0; i < b; i++) if(set.contains(Macro(st.nextToken()))) cnt++;
    
    bw.write(String.valueOf(a + b - (2 * cnt)));
    bw.close();
  }
}