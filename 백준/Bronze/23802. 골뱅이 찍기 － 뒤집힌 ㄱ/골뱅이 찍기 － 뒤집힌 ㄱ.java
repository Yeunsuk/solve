import java.util.*; //23802(구현) 골뱅이 찍기 - 뒤집힌 ㄱ
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String str1 = "@@@@@", str2 = "";

        for(int i = 0; i < num; i++) str2 += "@";
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                sb.append(str1);
            }
            sb.append("\n");
        }

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < num; j++) {
                sb.append(str2).append('\n');
            }
        }
    
        bw.write(sb.toString());
        bw.close();
    }
}