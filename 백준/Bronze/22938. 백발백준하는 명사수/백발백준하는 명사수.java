import java.util.*; // 22938(기하학) 백발백준하는 명사수
import java.io.*;

public class Main {
    static int Macro(String str) {
        return Integer.parseInt(str);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1 = Macro(st.nextToken());
        int y1 = Macro(st.nextToken());
        int r1 = Macro(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x2 = Macro(st.nextToken());
        int y2 = Macro(st.nextToken());
        int r2 = Macro(st.nextToken());
        
        long dist = (long) (x1 - x2) * (x1 - x2) + (long) (y1 - y2) * (y1 - y2);
        long tmp = (long) (r1 + r2) * (r1 + r2);
        bw.write(tmp > dist ? "YES" : "NO");
        bw.close();
    }
}