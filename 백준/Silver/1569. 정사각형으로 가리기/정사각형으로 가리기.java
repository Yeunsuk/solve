import java.util.*; //1569(기하학) 정사각형으로 가리기
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()), cnt1 = 0, cnt2 = 0;
        int mnx = 1000, mxx = -1000, mny = 1000, mxy = -1000;
        List<int[]> dot = new ArrayList<>();
        
        for(int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            dot.add(new int[]{x, y});
            mnx = Math.min(mnx, x);
            mxx = Math.max(mxx, x);
            mny = Math.min(mny, y);
            mxy = Math.max(mxy, y);
        }

        int len = Math.max(mxx - mnx, mxy - mny);
        for(int[] tmp : dot) {
            int x = tmp[0], y = tmp[1];

            boolean up1 = y == mny + len && x >= mnx && x <= mnx + len;
            boolean rt1 = x == mnx + len && y >= mny && y <= mny + len;
            boolean lt1 = x == mnx && y >= mny && y <= mny + len;
            boolean dw1 = y == mny && x >= mnx && x <= mnx + len;
            if(lt1 || rt1 || dw1 || up1) cnt1++;

            boolean lt2 = x == mxx - len && y >= mxy - len && y <= mxy;
            boolean dw2 = y == mxy - len && x >= mxx - len && x <= mxx;
            boolean up2 = y == mxy && x >= mxx - len && x <= mxx;
            boolean rt2 = x == mxx && y >= mxy - len && y <= mxy;
            if(lt2 || rt2 || dw2 || up2) cnt2++;
        }
        
        bw.write(String.valueOf((num != cnt1 && num != cnt2) ? -1 : len));
        bw.close();
    }
}