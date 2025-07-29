import java.util.*; //3986(자료구조) 좋은 단어
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Test = Integer.parseInt(br.readLine()), cnt = 0;
        
        while(Test-- > 0) {
            String str = br.readLine();
            if(str.length() % 2 == 1) continue;;
            
            Stack<Character> stack = new Stack<>();
            stack.push(str.charAt(0));
            
            for (int i = 1; i < str.length(); i++) {
                if(stack.size() > 0 && stack.peek() == str.charAt(i)) stack.pop();
                else stack.push(str.charAt(i));
            }
            
            if(stack.isEmpty()) cnt++;
        }
        
        bw.write(String.valueOf(cnt));
        bw.close();
    }
}