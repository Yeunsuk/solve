import java.util.*; //28279(자료구조) 덱 2
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Test = Integer.parseInt(br.readLine());
        Deque<Integer> deq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        
        while(Test-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            if(num == 1) deq.addFirst(Integer.parseInt(st.nextToken()));
            else if(num == 2) deq.addLast(Integer.parseInt(st.nextToken()));
            else if(num == 3) {
                if(deq.isEmpty()) sb.append("-1\n");
                else sb.append(deq.pollFirst()).append("\n");
            }else if(num == 4) {
                if(deq.isEmpty()) sb.append("-1\n");
                else sb.append(deq.pollLast()).append("\n");
            }else if(num == 5) sb.append(deq.size()).append("\n");
            else if(num == 6) {
                if(deq.isEmpty()) sb.append("1\n");
                else sb.append("0\n");
            }else if(num == 7) {
                if(deq.isEmpty()) sb.append("-1\n");
                else sb.append(deq.peekFirst()).append("\n");
            }else {
                if(deq.isEmpty()) sb.append("-1\n");
                else sb.append(deq.peekLast()).append("\n");
            }
        }
        
        bw.write(sb.toString());
        bw.close();
    }
}