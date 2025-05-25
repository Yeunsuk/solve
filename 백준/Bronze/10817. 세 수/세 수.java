import java.util.*; //10817(구현) 세 수
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if((a >= b && a <= c) || (a <= b && a >= c)) bw.write(String.valueOf(a));
        else if((b >= a && b <= c) || (b <= a && b >= c)) bw.write(String.valueOf(b));
        else bw.write(String.valueOf(c));
        bw.close();
    }
}