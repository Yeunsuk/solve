import java.util.*; //2443(구현) 별 찍기 - 6
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < i; j++) sb.append(' ');
            for(int j = 0; j < (num - i) * 2 - 1; j++) sb.append('*');
            sb.append('\n');
        }
        
        bw.write(sb.toString());
        bw.close();
    }
}