import java.util.*; // 6502(기하학) 동혁 피자
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            if(r == 0) break;

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int tmp = x * x + y * y;

            cnt++;
            boolean std = (tmp <= 4 * r * r) ? true : false;
            if(std) sb.append("Pizza ").append(cnt).append(" fits on the table.\n");
            else sb.append("Pizza ").append(cnt).append(" does not fit on the table.\n");
        }
        
        bw.write(sb.toString());
        bw.close();
    }
}