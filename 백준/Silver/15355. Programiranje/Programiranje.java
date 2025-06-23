import java.util.*; //15355(누적합) Programiranje
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int len = str.length();

        int Test = Integer.parseInt(br.readLine());
        int[][] arr = new int[len + 1][26];
        
        for(int i = 0; i < len; i++) {
            int ch = str.charAt(i) - 'a';
            for(int j = 0; j < 26; j++) arr[i + 1][j] = arr[i][j] + (j == ch ? 1 : 0);
        }
        
        while(Test-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            boolean std = true;

            if(b - a + 1 != d - c + 1) {
                sb.append("NE\n");
                continue;
            }

            for (int i = 0; i < 26; i++) {
                int cnt_x = arr[b][i] - arr[a - 1][i];
                int cnt_y = arr[d][i] - arr[c - 1][i];
                if(cnt_x != cnt_y) {
                    std = false;
                    break;
                }
            }

            sb.append(std ? "DA\n" : "NE\n");
        }
        
        
        bw.write(String.valueOf(sb));
        bw.close();
    }
}