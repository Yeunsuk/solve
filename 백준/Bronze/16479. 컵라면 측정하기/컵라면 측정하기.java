import java.util.*; // 16479(기하학) 컵라면 측정하기
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int d1 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());
        double n = Math.abs(d1 - d2) / 2.0;
        
        bw.write(String.valueOf(k * k - n * n));
        bw.close();
    }
}