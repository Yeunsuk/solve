import java.util.*; //2644(그래프) 촌수계산
import java.io.*;

public class Main {
  static List<Integer>[] arr;
  static boolean[] check;
  static int[] dist;
  static int rlt = -1;
  
  static void bfs(int stt, int end) {
    Queue<Integer> q = new LinkedList<>();
    check[stt] = true;
    dist[stt] = 0;
    q.offer(stt);
    
    while(!q.isEmpty()) {
      int tmp = q.poll();

      if(tmp == end) {
        rlt = dist[tmp];
        return;
      }

      for(int t : arr[tmp]) {
        if(!check[t]) {
          check[t] = true;
          dist[t] = dist[tmp] + 1;
          q.offer(t);
        }
      }
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    arr = new ArrayList[num + 1];
    check = new boolean[num + 1];
    dist = new int[num + 1];
    
    for(int i = 1; i < num + 1; i++) arr[i] = new ArrayList<>();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(br.readLine());

    for(int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      arr[a].add(b);
      arr[b].add(a);
    }

    bfs(x, y);
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}
