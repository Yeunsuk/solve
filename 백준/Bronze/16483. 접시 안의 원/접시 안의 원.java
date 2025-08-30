import java.util.*; // 16438(기하학) 접시 안의 원
import java.io.*;

public class Main {   
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double num = Integer.parseInt(br.readLine()) / 2.0;
        long rlt = Math.round(num * num);
        bw.write(String.valueOf(rlt));
        bw.close();
    }
}