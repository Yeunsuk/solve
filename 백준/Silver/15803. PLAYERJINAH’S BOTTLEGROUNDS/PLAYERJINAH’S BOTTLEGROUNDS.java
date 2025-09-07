import java.util.*; // 15803(기하학) PLAYERJINAH’S BOTTLEGROUNDS
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[3][2];

        for(int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int std = (arr[1][1] - arr[0][1]) * (arr[2][0] - arr[1][0]);
        int tmp = (arr[2][1] - arr[1][1]) * (arr[1][0] - arr[0][0]);
        
        if(std != tmp) bw.write("WINNER WINNER CHICKEN DINNER!");
        else bw.write("WHERE IS MY CHICKEN?");
        bw.close();
    }
}