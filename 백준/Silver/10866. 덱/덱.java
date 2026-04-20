import java.util.*; //10866(자료구조) 덱
import java.io.*;

public class Main { 
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ArrayDeque<Integer> d = new ArrayDeque<Integer>();
    int n = Integer.parseInt(br.readLine());

    for(int i = 0; i < n; i++) {
      String[] str = br.readLine().split(" ");
      
      switch(str[0]) {
        case "push_front": {
          d.addFirst(Integer.parseInt(str[1]));
          break;
        }
        case "push_back": {
          d.addLast(Integer.parseInt(str[1]));
          break;
        }
        case "pop_front": {
          if(d.isEmpty()) bw.write("-1\n");
          else bw.write(d.pollFirst() +"\n");
          break;
        }
        case "pop_back": {
          if(d.isEmpty()) bw.write("-1\n");
          else bw.write(d.pollLast() + "\n");
          break;
        }
        case "size": {
          bw.write(d.size() + "\n");
          break;
        }
        case "empty": {
          if (d.isEmpty()) bw.write("1\n");
          else bw.write("0\n");
          break;
        }
        case "front": {
          if(d.isEmpty()) bw.write("-1\n");
          else bw.write(d.peekFirst() + "\n");
          break;
        }
        case "back": {
          if(d.isEmpty()) bw.write("-1\n");
          else bw.write(d.peekLast() + "\n");
          break;
        }
      }
    }
    
    bw.close();
  }
}