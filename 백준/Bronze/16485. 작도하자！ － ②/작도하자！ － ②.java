import java.util.*; // 16485(기하학) 작도하자! - ②
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        bw.write(String.valueOf(Double.parseDouble(st.nextToken()) / Integer.parseInt(st.nextToken())));
        bw.close();
    }
}