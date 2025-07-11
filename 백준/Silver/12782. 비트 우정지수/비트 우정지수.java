import java.util.*; //12782(그리디) 비트 우정지수
import java.math.*;
import java.io.*;

public class Main {
    static int stoi(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Test = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        while(Test-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            BigInteger std = new BigInteger(st.nextToken(), 2);
            BigInteger tmp = new BigInteger(st.nextToken(), 2);
            
            int cnt_s1 = std.bitCount(), cnt_t1 = tmp.bitCount();
            int cnt = std.xor(tmp).bitCount();
            int rlt = Math.abs(cnt_s1 - cnt_t1);
            
            sb.append((cnt - rlt) / 2 + rlt).append('\n');
        }

        bw.write(sb.toString());
        bw.close();
    }
}