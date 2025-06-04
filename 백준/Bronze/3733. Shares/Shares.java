import java.util.*; //3733(수학) Shares
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String tmp;
        
        while((tmp = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(tmp);
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            sb.append(m / ++n).append('\n');
        }
        
        bw.write(sb.toString());
        bw.close();
    }
}
