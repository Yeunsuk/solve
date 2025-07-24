import java.util.*; //11279(자료구조) 최대 힙
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Test = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(Test-- > 0) {
            int tmp = Integer.parseInt(br.readLine());
            
            if(tmp == 0) sb.append(q.isEmpty() ? 0 : q.poll()).append('\n');
            else q.offer(tmp);
        }
        
        bw.write(sb.toString());
        bw.close();
    }
}