import java.util.*; //10869(수학) 사칙연산
import java.math.*;
import java.io.*;

public class Main {
    static int stoi(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = stoi(st.nextToken());
        int b = stoi(st.nextToken());

        sb.append(a + b).append('\n');
        sb.append(a - b).append('\n');
        sb.append(a * b).append('\n');
        sb.append(a / b).append('\n');
        sb.append(a % b).append('\n');
        bw.write(sb.toString());
        bw.close();
    }
}