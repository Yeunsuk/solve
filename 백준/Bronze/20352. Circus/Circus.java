import java.util.*; // 20352(기하학) Circus
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(br.readLine());
        double rlt = 2 * Math.sqrt(num * Math.PI);
        bw.write(String.format("%.10f\n", rlt));
        bw.close();
    }
}