import java.util.*; //6416(graphs) 트리인가?
import java.io.*;

public class Main {
  static int stoi(String s) { return Integer.parseInt(s); }
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Map<Integer, Integer> map = new HashMap<>();
    StringBuilder sb = new StringBuilder();
    Set<Integer> set = new HashSet<>();
    StringTokenizer st;
    
    out : 
    for(int Test = 1; ; Test++) {
      map = new HashMap<>();
      set = new HashSet<>();
      boolean flag = false;

      st = new StringTokenizer(br.readLine());
      while(true) {
        if(!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); 
        int b = Integer.parseInt(st.nextToken());
        if(a == -1) break out;
        if(a == 0) break;
        
        if(!set.add(b)) flag = true;
        map.put(a, map.getOrDefault(a, 0)+1);
      }

      if(set.size() != 0) {
        int root = 0;
        for(int tmp : map.keySet()) if(!set.contains(tmp)) root++;
        if(root != 1) flag = true;
      }

      sb.append("Case ").append(Test).append(flag ? " is not a tree.\n" : " is a tree.\n");
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}