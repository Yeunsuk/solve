import java.util.*; //1198(기하학) 삼각형으로 자르기
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] arr = new int[num][2];
        double rlt = 0;

        for(int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < num - 2; i++) {
            int x1 = arr[i][0], y1 = arr[i][1];
            
            for(int j = i + 1; j < num - 1; j++) {
                int x2 = arr[j][0], y2 = arr[j][1];
                
                for(int k = j + 1; k < num; k++) {
                    int x3 = arr[k][0], y3 = arr[k][1];
                    int tmp = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
                    rlt = Math.max(rlt, Math.abs(tmp));
                }
            }
        }

        bw.write(String.valueOf(rlt / 2));
        bw.close();
    }
}