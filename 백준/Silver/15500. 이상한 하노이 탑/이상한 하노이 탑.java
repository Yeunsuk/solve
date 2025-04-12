import java.util.*; //15500(구현) 이상한 하노이 탑
import java.math.*;
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine()), cnt = 0;;
    StringBuilder sb = new StringBuilder();
    Stack<Integer> stk1 = new Stack<>();
    Stack<Integer> stk2 = new Stack<>();
      
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < num; i++) stk1.push(Integer.parseInt(st.nextToken()));

    while(num > 0) {
      if(stk1.contains(num)) {
        while(stk1.size() > 0) {
          int tmp = stk1.pop();

          if(tmp == num) {
            sb.append("1 3\n");
            cnt++;
            num--;
            break;
          }else {
            sb.append("1 2\n");
            stk2.push(tmp);
            cnt++;
          }
        }
      }else if(stk2.contains(num)) {
        while(stk2.size() > 0) {
          int tmp = stk2.pop();

          if(tmp == num) {
            sb.append("2 3\n");
            cnt++;
            num--;
            break;
          }else {
            sb.append("2 1\n");
            stk1.push(tmp);
            cnt++;
          }
        }
      }
    }

    bw.write(cnt + "\n");
    bw.write(sb.toString());
    bw.close();
  }
}
