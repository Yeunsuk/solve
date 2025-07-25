import java.util.*; //11286(자료구조) 절댓값 힙
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Test = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> {
            int A = Math.abs(a);
            int B = Math.abs(b);

            if (A == B) return Integer.compare(a, b);
            else return Integer.compare(A, B);
        });

        while(Test-- > 0) {
            int tmp = Integer.parseInt(br.readLine());
            
            if(tmp == 0) sb.append(q.isEmpty() ? 0 : q.poll()).append('\n');
            else q.offer(tmp);
        }
        
        bw.write(sb.toString());
        bw.close();
    }
}