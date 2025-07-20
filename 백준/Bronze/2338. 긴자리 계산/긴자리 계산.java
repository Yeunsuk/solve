import java.util.*; //2338(수학) 긴자리 계산
import java.math.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        sb.append(a.add(b)).append("\n");
        sb.append(a.subtract(b)).append("\n");
        sb.append(a.multiply(b)).append("\n");
        bw.write(sb.toString());
        bw.close();
    }
}