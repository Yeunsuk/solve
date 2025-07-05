import java.util.*; //33573(수학) 대칭제곱수
import java.io.*;

public class Main {
    public static boolean isbool(long num) {
        long tmp = (long)Math.sqrt(num);
        return tmp * tmp == num;
    }
    
    public static long rev(long num) {
        long rlt = 0;
        
        while(num > 0) {
            rlt = rlt * 10 + num % 10;
            num /= 10;
        }

        return rlt;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int Test = Integer.parseInt(br.readLine());

        while(Test-- > 0) {
            long num = Long.parseLong(br.readLine());
            sb.append(isbool(num) && isbool(rev(num)) ? "YES\n" : "NO\n");
        }

        bw.write(sb.toString());
        bw.close();
    }
}