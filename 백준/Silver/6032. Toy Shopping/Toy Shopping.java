import java.util.*; //6032(그리디) Toy Shopping
import java.io.*;

public class Main {
    static int stoi(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = stoi(br.readLine());
        
        double arr[][] = new double[num][3];
        for(int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double joy = stoi(st.nextToken());
            int price = stoi(st.nextToken());
            arr[i][1] = joy / price;
            arr[i][0] = price;
            arr[i][2] = i + 1;
        }

        Arrays.sort(arr, (a, b) -> Double.compare(b[1], a[1]));
        sb.append((int)(arr[0][0] + arr[1][0] + arr[2][0])).append('\n');
        sb.append((int)arr[0][2]).append('\n');
        sb.append((int)arr[1][2]).append('\n');
        sb.append((int)arr[2][2]).append('\n');
        bw.write(sb.toString());
        bw.close();
    }
}