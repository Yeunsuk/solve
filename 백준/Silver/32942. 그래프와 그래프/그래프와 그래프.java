import java.util.*; //32942(graphs) 그래프와 그래프
import java.io.*;

public class Main {
  static int stoi(String s) { return Integer.parseInt(s); }
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    List<List<Integer>> list = new ArrayList<>();
    for(int i = 0; i < 10; i++) list.add(new ArrayList<>());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());
    StringBuilder sb = new StringBuilder();
    
    for(int i = 1; i < 11; i++) {
      for(int j = 1; j < 11; j++) if(a*i + b*j == c) list.get(i-1).add(j);
    }

    for(List<Integer> tmp : list) {
      if(tmp.isEmpty()) sb.append('0');
      else for(int t : tmp) sb.append(t).append(' ');
      sb.append('\n');
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}