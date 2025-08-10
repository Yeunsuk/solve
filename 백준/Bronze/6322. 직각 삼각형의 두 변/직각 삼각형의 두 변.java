import java.util.*; //6322(기하학) 직각 삼각형의 두 변
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0 && c == 0) break;

            sb.append("Triangle #").append(++cnt).append("\n");
            if(c == -1) {
                double tmp = a * a + b * b;
                sb.append("c = ").append(String.format("%.3f", Math.sqrt(tmp))).append("\n");
            }else if(b == -1) {
                double tmp = c * c - a * a;
                if(tmp <= 0) sb.append("Impossible.\n");
                else sb.append("b = ").append(String.format("%.3f", Math.sqrt(tmp))).append("\n");
            }else {
                double tmp = c * c - b * b;
                if(tmp <= 0) sb.append("Impossible.\n");
                else sb.append("a = ").append(String.format("%.3f", Math.sqrt(tmp))).append("\n");
            }

            sb.append("\n");
        }
        
        bw.write(sb.toString());
        bw.close();
    }
}