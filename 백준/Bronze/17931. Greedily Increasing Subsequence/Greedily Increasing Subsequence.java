import java.util.*; //17931(그리디) Greedily Increasing Subsequence
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()), gis = 0, cnt = 0;
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < num; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            if(tmp > gis) {
                sb.append(tmp + " ");
                gis = tmp;
                cnt++;
            }
        }           

        bw.write(cnt + "\n" + sb.toString());
        bw.close();
    }
}