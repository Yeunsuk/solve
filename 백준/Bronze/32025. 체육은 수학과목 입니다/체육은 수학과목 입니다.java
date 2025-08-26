import java.util.*; // 32025(기하학) 체육은 수학과목 입니다
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Math.min(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));
        bw.write(String.valueOf(num * 50));
        bw.close();
    }
}