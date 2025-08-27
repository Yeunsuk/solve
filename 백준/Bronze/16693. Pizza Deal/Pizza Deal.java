import java.util.*; // 16693(기하학) Pizza Deal
import java.io.*;

public class Main {
    static int Macro(String str) {
        return Integer.parseInt(str);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Macro(st.nextToken());
        int b = Macro(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int c = Macro(st.nextToken());
        int d = Macro(st.nextToken());

        double rlt1 = (double) a / b, rlt2 = (Math.PI * c * c) / d;
        bw.write(rlt1 > rlt2 ? "Slice of pizza" : "Whole pizza");
        bw.close();
    }
}