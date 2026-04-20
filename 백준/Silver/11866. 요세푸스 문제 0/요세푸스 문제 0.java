import java.util.*; //11866(큐) 요세푸스 문제 0
import java.io.*;

public class Main {
  
  public static void main(String[] args) throws IOException{ 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    st = new StringTokenizer(br.readLine());
    int cc = Integer.parseInt(st.nextToken());
    int dd = Integer.parseInt(st.nextToken());
    Queue<Integer> q = new LinkedList<>();
    sb.append("<");
    br.close();

    for(int i = 1; i <= cc; i++) {
      q.add(i);
    }
    
    while(q.size() > 0) {
      for(int j = 1; j < dd; j++) {
        q.add(q.poll());
      }

      sb.append(q.element() + ", ");
      q.poll();
    }

    sb.deleteCharAt(sb.length() - 1);
    sb.deleteCharAt(sb.length() - 1);
    sb.append(">");
    System.out.print(sb);
  } 
}