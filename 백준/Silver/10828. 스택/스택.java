import java.util.*; //10828(자료구조) 스택
import java.io.*;

public class Main { 
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Stack<Integer> sk = new Stack<Integer>();
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st;

    for(int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      String s = st.nextToken();
       
      if(s.equals("push")) sk.push(Integer.parseInt(st.nextToken()));
      else if(s.equals("pop")) {
        if(!sk.empty()) bw.write(sk.pop() + "\n");
        else bw.write("-1\n");
      }else if(s.equals("size")) bw.write(sk.size() + "\n");
      else if(s.equals("empty")) {
        if(!sk.empty()) bw.write("0\n");
        else bw.write("1\n");
      }else {
        if(!sk.empty()) bw.write(sk.peek() + "\n");
        else bw.write("-1\n");
      }
    }
    
    bw.close();
  }
}