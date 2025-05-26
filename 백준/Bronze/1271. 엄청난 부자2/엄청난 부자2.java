import java.util.*; //1271(수학) 엄청난 부자2
import java.math.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        BigInteger[] arr = new BigInteger(st.nextToken()).divideAndRemainder(new BigInteger(st.nextToken()));
        bw.write(arr[0] + "\n" + arr[1]);
        bw.close();
    }
}