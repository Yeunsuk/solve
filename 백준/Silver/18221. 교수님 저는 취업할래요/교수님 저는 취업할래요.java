import java.util.*; //18221(기하학) 교수님 저는 취업할래요
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()), cnt = 0;
        boolean flag = true, a = false, b = false;
        int y1 =-1, y2 = -1, x1 = -1, x2 = -1;
        int arr[][] = new int[num][num];
        
        for(int i = 0; i < num && (!a || !b); i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < num; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 2) {
                    y1 = i; x1 = j;
                    a = true;
                }else if(arr[i][j] == 5) {
                    y2 = i; x2 = j;
                    b = true;
                }
            } 
        }
        
        int std = (y1 - y2) * (y1 - y2) + (x1 - x2) * (x1 - x2);
        if(std < 25) flag = false;

        for(int i = Math.min(y1 ,y2); i <= Math.max(y1, y2); i++) {
            for(int j = Math.min(x1, x2); j <= Math.max(x1, x2); j++) {
                if(arr[i][j] == 1) cnt++;
                if(cnt >= 3) break;
            }

            if(cnt >= 3) break;
        }

        if(cnt < 3) flag = false; 
        bw.write(flag ? "1" : "0");
        bw.close();
    }
}