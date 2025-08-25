import java.util.*; // 16600(기하학) Contemporary Art
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double num = Math.sqrt(Long.parseLong(br.readLine()));
        bw.write(String.valueOf(num * 4));
        bw.close();
    }
}