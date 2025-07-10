import java.util.*; //27589(자료구조) Streets Ahead
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) map.put(br.readLine(), i);
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = map.get(st.nextToken());
            int b = map.get(st.nextToken());
            
            sb.append(Math.abs(a - b) - 1).append('\n');
        }

        bw.write(sb.toString());
        bw.close();
    }
}