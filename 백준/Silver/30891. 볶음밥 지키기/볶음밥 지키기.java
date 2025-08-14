import java.util.*; //30891(기하학) 볶음밥 지키기
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken()), cnt = 0;
        int r = Integer.parseInt(st.nextToken());
        int mnx = 100, mxx = -100, x = 0;
        int mny = 100, mxy = -100, y = 0;
        int[][] arr = new int[num][2];
        
        for(int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            mnx = Math.min(mnx, arr[i][0]);
            mxx = Math.max(mxx, arr[i][0]);
            mny = Math.min(mny, arr[i][1]);
            mxy = Math.max(mxy, arr[i][1]);
        }

        for(int i = mnx; i <= mxx; i++) {
            for(int j = mny; j <= mxy; j++) {
                int count = 0;
                
                for(int k = 0; k < num; k++) {
                    double tmp = Math.pow(i - arr[k][0], 2) + Math.pow(j - arr[k][1], 2);
                    if(tmp <= r * r) count++;
                }

                if(count > cnt) {
                    cnt = count;
                    x = i;
                    y = j;
                }
            }
        }
        
        bw.write(x + " " + y);
        bw.close();
    }
}