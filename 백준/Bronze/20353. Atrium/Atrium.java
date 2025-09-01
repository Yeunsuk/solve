import java.util.*; // 20353(기하학) Atrium
import java.io.*;

public class Main {
    static int Macro(String str) {
        return Integer.parseInt(str);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double num = Math.sqrt(Long.parseLong(br.readLine()));
        bw.write(String.valueOf(num * 4));
        bw.close();
    }
}