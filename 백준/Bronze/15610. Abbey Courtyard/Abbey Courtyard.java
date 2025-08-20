import java.util.*; // 15610(기하학) Abbey Courtyard
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(br.readLine());
        double rlt = Math.sqrt(num) * 4;
        bw.write(String.valueOf(rlt));
        bw.close();
    }
}