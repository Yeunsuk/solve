import java.util.*; //19947(dp) 투자의 귀재 배주형
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int money = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        int[] dp = new int[num + 1];
        dp[0] = money;

        for(int i = 1; i <= num; i++) {
            dp[i] = (int)Math.max(dp[i], dp[i - 1] * 1.05);
            if(i >= 3) dp[i] = (int)Math.max(dp[i], dp[i - 3] * 1.2);
            if(i >= 5) dp[i] = (int)Math.max(dp[i], dp[i - 5] * 1.35);
        }

        bw.write(String.valueOf(dp[num]));
        bw.close();
    }
}