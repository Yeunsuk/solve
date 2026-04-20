import java.util.*; //10845(자료구조) 큐
import java.io.*;

public class Main { 
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Queue<Integer> q = new LinkedList<>();
    StringTokenizer st;

    for(int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      String str = st.nextToken();

      if(str.equals("push")) {
        int num = Integer.parseInt(st.nextToken());
        q.add(num);
      }else if(str.equals("front")) {
        if(q.isEmpty()) bw.write("-1\n");
        else bw.write(q.peek() + "\n");
      }else if(str.equals("back")) {
        if(q.size() == 0) bw.write("-1\n");
        else {
          int tmp = ((LinkedList<Integer>) q).getLast();
          bw.write(tmp + "\n"); 
        }
      }else if(str.equals("size")) bw.write(q.size() + "\n");
      else if(str.equals("empty")) {
        if(q.isEmpty()) bw.write("1\n");
        else bw.write("0\n");
      }else if(str.equals("pop")) {
        if(q.isEmpty()) bw.write("-1\n");
        else bw.write(q.poll() + "\n");
      }
    }
    
    bw.close();
  }
}