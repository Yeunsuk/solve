import java.util.*; // 1925(기하학) 삼각형
import java.io.*;

public class Main {
    public static long distance(long[] a, long[] b) {
        long dx = a[0] - b[0];
        long dy = a[1] - b[1];
        return dx * dx + dy * dy;
    }

    public static int Macro(long[] a, long[] b, long[] c) {
        long tmp = (b[0] - a[0]) * (c[1] - a[1]) - (b[1] - a[1]) * (c[0] - a[0]);
        
        if(tmp > 0) return 1;
        else if(tmp < 0) return -1;
        else return 0;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[][] arr = new long[3][2];
        long[] len = new long[3];
        
        for(int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Long.parseLong(st.nextToken());
            arr[i][1] = Long.parseLong(st.nextToken());
        }

        if(Macro(arr[0], arr[1], arr[2]) == 0) bw.write("X");
        else {
            len[0] = distance(arr[0], arr[1]);
            len[1] = distance(arr[0], arr[2]);
            len[2] = distance(arr[1], arr[2]);
            Arrays.sort(len);

            if(len[0] == len[1] && len[1] == len[2]) bw.write("JungTriangle");
            else if (len[0] + len[1] == len[2]) {
                if(len[0] == len[1]) bw.write("Jikkak2Triangle");
                else bw.write("JikkakTriangle");
            } else if (len[0] + len[1] < len[2]) {
                if(len[0] == len[1]) bw.write("Dunkak2Triangle");
                else bw.write("DunkakTriangle");
            } else {
                if(len[0] == len[1] || len[1] == len[2]) bw.write("Yeahkak2Triangle");
                else bw.write("YeahkakTriangle");
            }
        }
        
        bw.close();
    }
}