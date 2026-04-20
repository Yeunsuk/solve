import java.util.*; //2164(큐) 카드2
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException{ 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

    int num = Integer.parseInt(br.readLine());
    Queue<Integer> q = new LinkedList<>();
    br.close();

    for(int i = 1; i <= num; i++) {
      q.add(i);
    }

    while(q.size() > 1) {
      q.poll();
      q.add(q.poll());
    }
    
    System.out.print(q.element());
  } 
}