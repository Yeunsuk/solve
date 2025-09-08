import java.util.*; // 10655(기하학) 마라톤 1
import java.io.*;

public class Main {
    static int dist(int[] a, int[] b) {
        return Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1]);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()), gap = 0, rlt = 0;
        int[][] arr = new int[num][2];
        int[] std = new int[num - 1];

        for(int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0; i < num - 1; i++) {
            std[i] = dist(arr[i], arr[i + 1]);
            rlt += std[i];
    
            if(i != 0) gap = Math.max(std[i] + std[i - 1] - dist(arr[i - 1], arr[i + 1]), gap);
        }
        
        bw.write(String.valueOf(rlt - gap));
        bw.close();
    }
}