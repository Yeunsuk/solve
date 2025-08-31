import java.util.*; // 15923(기하학) 욱제는 건축왕이야!!
import java.io.*;

public class Main {  
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int mnx = 40, mny = 40, mxx = 0, mxy = 0;

        for(int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            mnx = Math.min(mnx, x);
            mny = Math.min(mny, y);
            mxx = Math.max(mxx, x);
            mxy = Math.max(mxy, y);
        }
        
        bw.write(String.valueOf(((mxx - mnx) + (mxy - mny)) * 2));
        bw.close();
    }
}