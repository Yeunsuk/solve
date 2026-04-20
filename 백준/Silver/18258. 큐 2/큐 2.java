import java.util.*; //18258(자료구조) 큐 2
import java.io.*;

public class Main { 
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Deque<Integer> q = new ArrayDeque<>();
    StringTokenizer st;
    

    while(n-- > 0) {
      st = new StringTokenizer(br.readLine(), " ");
      
      switch(st.nextToken()) {	
        case "push": {
          q.offer(Integer.parseInt(st.nextToken()));	
          break;
        }
  
        case "pop" : {
          Integer tmp_1 = q.poll();	
          if(tmp_1 == null) bw.write("-1\n");
          else bw.write(tmp_1 + "\n");
          break;
        }
  
        case "size": {
          bw.write(q.size() + "\n");
          break;
        }
  
        case "empty": {
          if(q.isEmpty()) bw.write("1\n");
          else bw.write("0\n");
          break;
        }
  
        case "front": {
          Integer tmp_2 = q.peek();
          if(tmp_2 == null) bw.write("-1\n");
          else bw.write(tmp_2 + "\n");
          break;
        }
  
        case "back": {
          Integer tmp_3 = q.peekLast();	 
          if(tmp_3 == null) bw.write("-1\n");
          else bw.write(tmp_3 + "\n");
          break;
        }
      }
    }
    
    bw.close();
  }
}