import java.util.*; //1069(기하학) 집으로
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        
        double dist = Math.sqrt(x * x + y * y), rlt;
        int std = (int)(dist / d);
    
        if(dist >= d) {
            double tmp = t * std + (dist - d * std);
            rlt = Math.min(tmp, Math.min(dist, t * (std + 1)));
        }else {
            double tmp = t + (d - dist);
            rlt = Math.min(tmp, Math.min(dist, t * 2));
        }

        bw.write(String.valueOf(rlt));
        bw.close();
    }
}