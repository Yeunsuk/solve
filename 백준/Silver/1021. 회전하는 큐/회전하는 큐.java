import java.util.*; //1021(자료구조) 회전하는 큐
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        LinkedList<Integer> deq = new LinkedList<Integer>();
        int n = Integer.parseInt(st.nextToken()), cnt = 0;
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[m];
        
        for(int i = 1; i <= n; i++) deq.offer(i);
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) arr[i] = Integer.parseInt(st.nextToken());
        
        for(int i = 0; i < m; i++) {
            int siz = deq.size();
            int tgt = deq.indexOf(arr[i]);
            int std = siz % 2 == 0 ? siz / 2 - 1 : siz / 2;
            
            if(tgt <= std) {
                for(int j = 0; j < tgt; j++) {
                    int tmp = deq.pollFirst();
                    deq.offerLast(tmp);
                    cnt++;
                }
            }else {
                for(int j = 0; j < siz - tgt; j++) {
                    int tmp = deq.pollLast();
                    deq.offerFirst(tmp);
                    cnt++;
                }

            }
            
            deq.pollFirst();
        }

        bw.write(String.valueOf(cnt));
        bw.close();
    }
}