import java.util.*; //10871(구현) X보다 작은 수
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int std = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < num; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            if(tmp < std) sb.append(tmp).append(" ");
        }
        
        bw.write(sb.toString());
        bw.close();
    }
}