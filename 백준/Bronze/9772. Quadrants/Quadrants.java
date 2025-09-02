import java.util.*; // 9772(기하학) Quadrants
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            
            if(a == 0 || b == 0) {
                sb.append("AXIS\n");
                if(a == 0 && b == 0) break;
            }
            else if(a > 0) sb.append(b > 0 ? "Q1\n" : "Q4\n");
            else sb.append(b > 0 ? "Q2\n" : "Q3\n");
        }
        
        bw.write(sb.toString());
        bw.close();
    }
}