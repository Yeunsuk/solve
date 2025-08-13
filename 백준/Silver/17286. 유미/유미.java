import java.util.*; //17286(기하학) 유미
import java.io.*;

public class Main {
    static double d(int[] arr1, int[] arr2) {
        int x = arr1[0] - arr2[0];
        int y = arr1[1] - arr2[1];
        return Math.sqrt(x * x + y * y);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[4][2];

        for(int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        double a = d(arr[0], arr[1]);
        double b = d(arr[0], arr[2]);
        double c = d(arr[0], arr[3]);
        double ab = d(arr[1], arr[2]);
        double bc = d(arr[2], arr[3]);
        double ca = d(arr[3], arr[1]);
        
        double[] dist = {a + ab + bc, a + ca + bc, b + ab + ca, b + bc + ca, c + bc + ab, c + ca + ab};
        Arrays.sort(dist);
        
        bw.write(String.valueOf((int)dist[0]));
        bw.close();
    }
}