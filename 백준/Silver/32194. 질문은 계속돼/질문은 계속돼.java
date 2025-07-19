import java.util.*; //32194(누적합) 질문은 계속돼
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] yes = new int[num + 2];
        int[] no = new int[num + 2];
        yes[1] = 1;

        for(int i = 2; i <= num + 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int std = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            boolean rlt = false;
            yes[i] = yes[i - 1];
            no[i] = no[i - 1];
            
            if (std == 1) rlt = (yes[b] - yes[a - 1]) == (b - a + 1);
            else if (std == 2) rlt = (no[b] - no[a - 1]) == (b - a + 1);
            
            if(rlt) {
                yes[i]++;
                sb.append("Yes\n");
            }else {
                no[i]++;
                sb.append("No\n");
            }
        }
        
        bw.write(sb.toString());
        bw.close();
    }
}