import java.util.*; //23037(수학) 5의 수난
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum = 0;

        for(int i = 0; i < 5; i++) {
            int n = str.charAt(i) - '0';
            sum += n * n * n * n * n;
        }
        
        bw.write(String.valueOf(sum));
        bw.close();
    }
}