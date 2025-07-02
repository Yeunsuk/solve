import java.util.*; //1793(dp) 타일링
import java.math.*;
import java.io.*;

public class Main {
    static int stoi(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BigInteger arr[] = new BigInteger[251];
        String str;
        
        arr[0] = new BigInteger("1");
        arr[1] = new BigInteger("1");
        arr[2] = new BigInteger("3");
        for(int i = 3; i < 251; i++) arr[i] = arr[i - 1].add(arr[i - 2].multiply(new BigInteger("2")));
        while((str = br.readLine()) != null) sb.append(arr[stoi(str)]).append('\n');
                
        bw.write(sb.toString());
        bw.close();
    }
}