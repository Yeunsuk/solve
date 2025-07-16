import java.util.*; //33572(그리디) 자세히 보아야 예쁘다
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken()), sum = 0;
        long m = Long.parseLong(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) sum += Long.parseLong(st.nextToken());
            

        bw.write(sum >= m + n ? "DIMI" : "OUT");
        bw.close();
    }
}