import java.util.*; //1834(수학) 나머지와 몫이 같은 수
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        
        bw.write(String.valueOf((n + 1) * (n - 1) * n / 2));
        bw.close();
    }
}