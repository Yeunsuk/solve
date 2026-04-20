import java.util.*; //4158(자료구) CD
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashSet<Integer> set;
    StringTokenizer st;

    while(true) {
      st = new StringTokenizer(br.readLine());
      int n = Macro(st.nextToken());
      int m = Macro(st.nextToken());
      if(n == 0 && m == 0) break;
      set = new HashSet<>();
      int rlt = 0;
  
      while(n-- > 0) set.add(Macro(br.readLine()));
      while(m-- > 0) if(set.contains(Macro(br.readLine()))) rlt++;
      bw.write(rlt + "\n");
    }
    
    bw.close();
  }
}