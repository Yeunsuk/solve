import java.util.*; // 11880(기하학) 개미
import java.io.*;

public class Main {
    static int Macro(String str) {
        return Integer.parseInt(str);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int Test = Macro(br.readLine());

        while(Test-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Macro(st.nextToken());
            long b = Macro(st.nextToken());
            long c = Macro(st.nextToken());
            
            long rlt = Math.min(((a + b) * (a + b) + c * c), (a + c) * (a + c) + b * b);
            rlt = Math.min(rlt, (b + c) * (b + c) + a * a);
            sb.append(rlt).append("\n");
        }
    
        bw.write(sb.toString());
        bw.close();
    }
}