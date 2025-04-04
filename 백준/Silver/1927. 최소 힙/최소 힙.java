import java.util.*; //1927(자료구조) 최소 힙
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue<Integer> q = new PriorityQueue<>();
    int num = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    while(num-- > 0) {
      int tmp = Integer.parseInt(br.readLine());
      if(tmp == 0) {
        if (q.isEmpty()) sb.append('0').append('\n');
        else sb.append(q.poll()).append('\n');
      }else q.offer(tmp);
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}