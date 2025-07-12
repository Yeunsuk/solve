import java.util.*; //10166(수학) 관중석
import java.io.*;

public class Main {
    public static int GCD(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        boolean[][] arr = new boolean[2001][2001];
        int ans = 1;
        
        for (int i = a; i <= b; i++) {
            for (int j = 1; j < i; j++) {
                int gcd = GCD(i, j);
                int y = j / gcd;
                int x = i / gcd;
                
                if (!arr[y][x]) {
                    arr[y][x] = true;
                    ans++;
                }
            }
        }

        bw.write(String.valueOf(ans));
        bw.close();
    }
}