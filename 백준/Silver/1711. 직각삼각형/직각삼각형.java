import java.util.*; //1711(기하학) 직각삼각형
import java.io.*;

public class Main {
    public static long Distance(long x1, long y1, long x2, long y2) {
        return (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
    }

    public static boolean std(long a, long b, long c) {
        return a + b == c || a + c == b || b + c == a;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()), cnt = 0;
        int[][] arr = new int[num][2];
        
        for(int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < num - 2; i++) {
            int x1 = arr[i][0], y1 = arr[i][1];
            
            for(int j = i + 1; j < num - 1; j++) {
                int x2 = arr[j][0], y2 = arr[j][1];
                long a = Distance(x1, y1, x2, y2);
                
                for(int k = j + 1; k < num; k++) {
                    int x3 = arr[k][0], y3 = arr[k][1];
                    long b = Distance(x1, y1, x3, y3);
                    long c = Distance(x2, y2, x3, y3);
                    if(std(a, b, c)) cnt++;
                }
            }
        }

        bw.write(String.valueOf(cnt));
        bw.close();
    }
}