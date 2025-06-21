import java.util.*; //9296(구현) Grading Exams
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Test = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i <= Test; i++) {
            int num = Integer.parseInt(br.readLine()), cnt = 0;
            String std = br.readLine();
            String str = br.readLine();

            for(int j = 0; j < num; j++) {
                if(std.charAt(j) != str.charAt(j)) cnt++;
            }

            sb.append("Case ").append(i).append(": ").append(cnt).append('\n');
        }
        
        bw.write(sb.toString());
        bw.close();
    }
}