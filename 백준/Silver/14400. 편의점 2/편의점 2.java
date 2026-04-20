import java.util.*; // 14400(기하학) 편의점 2
import java.io.*;

public class Main {
    static int Macro(String str) {
        return Integer.parseInt(str);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()), x, y;
        int[] arr_x = new int[num], arr_y = new int[num];
        long rlt = 0;
        
        for(int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr_x[i] = Integer.parseInt(st.nextToken());
            arr_y[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr_x);
        x = arr_x[num / 2];
        Arrays.sort(arr_y);
        y = arr_y[num / 2];

        for(int i = 0; i < num; i++) rlt += Math.abs(x - arr_x[i]) + Math.abs(y - arr_y[i]);
        bw.write(String.valueOf(rlt));
        bw.close();
    }
}