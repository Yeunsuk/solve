import java.util.*; //9255(graphs) The Friend of My Enemy is My Enemy
import java.io.*;

public class Main {
  static class Node {
    int num;
    List<Integer> list;

    Node(int num) {
      this.num = num;
      this.list = new ArrayList<>();
    }
  }

  static int stoi(String s) { return Integer.parseInt(s); }
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int Test = stoi(br.readLine());
    
    for(int t = 1; t <= Test; t++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = stoi(st.nextToken()), m = stoi(st.nextToken());

      Node[] arr = new Node[++n];
      while(n-- > 1) arr[n] = new Node(n);

      while(m-- > 0) {
        st = new StringTokenizer(br.readLine());
        int a = stoi(st.nextToken()), b = stoi(st.nextToken());
        arr[a].list.add(b);
        arr[b].list.add(a);
      }

      sb.append("Data Set ").append(t).append(":\n");
      for(int i : new TreeSet<>(arr[stoi(br.readLine())].list))
        sb.append(i).append(" ");
      sb.append("\n\n");
    }
    
    bw.write(sb.toString()); 
    bw.close();
  }
}