import java.util.*; //1005(dp) ACM Craft
import java.io.*;

public class Main {
  static int num, rule;
  static int[] time, node;
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  static int ps(List<List<Integer>> list, int tgt) {
    Queue<Integer> q = new LinkedList<Integer>();
    int[] rlt = new int[num];

    for(int i = 1; i < num; i++) {
      if(node[i] == 0) q.offer(i);
      rlt[i] = time[i];
    }

    while(!q.isEmpty()) {
      int tmp = q.poll();

      for(Integer i : list.get(tmp)) {
        rlt[i] = Math.max(rlt[i], rlt[tmp] + time[i]);
        node[i]--;

        if(node[i] == 0) q.offer(i);
      }
    }

    return rlt[tgt];
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Macro(br.readLine()), i;
    StringTokenizer st;

    while(Test-- > 0) {
      st = new StringTokenizer(br.readLine());
      num = Macro(st.nextToken()) + 1;
      rule = Macro(st.nextToken());

      time = new int[num];
      node = new int[num];
      st = new StringTokenizer(br.readLine());
      for(i = 1; i < num; i++) time[i] = Macro(st.nextToken());

      List<List<Integer>> list = new ArrayList<List<Integer>>();
      for(i = 0; i < num; i++) list.add(new ArrayList<Integer>());

      for(i = 0; i < rule; i++) {
        st = new StringTokenizer(br.readLine());
        int std = Macro(st.nextToken());
        int tmp = Macro(st.nextToken());
        
        list.get(std).add(tmp);
        node[tmp]++;
      }

      int tgt = Macro(br.readLine());
      bw.write(ps(list, tgt) + "\n");
    }

    bw.close();
  }
}