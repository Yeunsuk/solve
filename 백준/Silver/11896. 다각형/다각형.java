import java.util.*; //11896(기하학) 다각형
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        if(a % 2 != 0) a++;
        if(b % 2 != 0) b--;
        if(a <= 2) a = 4;
        
        if(a > b) bw.write("0");
        else {
            long tmp = ((b - a) / 2) + 1;
            long rlt = tmp * (a + b) / 2;
            bw.write(String.valueOf(rlt));
        }
        
        bw.close();
    }
}