import java.util.*; //24263(구현) 알고리즘 수업 - 알고리즘의 수행 시간 2
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw.write(Integer.parseInt(br.readLine()) + "\n1");
        bw.close();
    }
}