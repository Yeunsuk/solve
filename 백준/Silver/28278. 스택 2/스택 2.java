import java.util.*; //28278(자료 구조) 스택 2
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Stack<Integer> stack = new Stack<>();
    int n = Macro(br.readLine());
    StringTokenizer st;
    
    for(int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());

      switch(st.nextToken()) {
        case "1" :
          stack.push(Macro(st.nextToken()));
          break;
        case "2" :
          if(stack.isEmpty()) bw.write("-1\n");
          else bw.write(stack.pop() + "\n");
          break;
        case "3" :
          bw.write(stack.size() + "\n");
          break;
        case "4" :
          if(stack.isEmpty()) bw.write("1\n");
          else bw.write("0\n");
          break;
        case "5" :
          if(stack.isEmpty()) bw.write("-1\n");
          else bw.write(stack.peek() + "\n");
          break;
      }
    }

    bw.close();
  }
}