import java.util.*; //4949(자료구조) 균형잡힌 세상
import java.io.*;

public class Main {
  public static String Macro(String str) {
    Stack<Character> s = new Stack<>();

    for(int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      if(ch == '(' || ch == '[') s.push(ch);
      else if(ch == ')') {
        if(s.empty() || s.peek() != '(') return "no";
        else s.pop();
      }else if(ch == ']') {
        if(s.empty() || s.peek() != '[') return "no";
        else s.pop();
      }
    }

    if(s.empty()) return "yes";
    else return "no";
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s;

    while(true) {
      s = br.readLine();
      if(s.equals(".")) break;
      bw.write(Macro(s) + '\n');
    }
    bw.close();
  }
}