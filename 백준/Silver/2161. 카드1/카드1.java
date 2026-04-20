import java.util.*; //2161(큐) 카드1
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Queue<Integer> q = new LinkedList();
    
    int n = Integer.parseInt(br.readLine());
    for(int i = 1; i <= n; i++) q.add(i);
            
    while(q.size() != 1){
      int t = q.poll();
      bw.write(t + " ");
      t = q.poll();
      q.add(t);
    }
    n = q.poll();
    bw.write(n + " ");
    bw.close();
  }
}