import java.util.*; //9498(구현) 시험 성적
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        bw.write("FFFFFFDCBAA".charAt(n / 10));
        bw.close();
    }
}