import java.util.*; //11718(문자열) 그대로 출력하기
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String tmp = "";

        while((tmp = br.readLine()) != null) sb.append(tmp).append('\n');
        bw.write(sb.toString());
        bw.close();
    }
}