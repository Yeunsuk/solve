import java.util.*; //2553(수학) 마지막 팩토리얼 수
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        long sum = 1;
        
        for(int i = 1; i <= num; i++) {
            sum *= i;
            sum %= 10_000_000;
            while(sum % 10 == 0) sum /= 10;
        }
        
        bw.write(String.valueOf(sum % 10));
        bw.close();
    }
}