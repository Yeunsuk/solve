import java.util.*; //10950(수학) A+B - 3
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Test = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(Test-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
        }
        
        bw.write(sb.toString());
        bw.close();
    }
}