import java.util.*; //8362(정렬) Near
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int trees = Integer.parseInt(st.nextToken());
        int apple = Integer.parseInt(st.nextToken());
        int[] arr = new int[trees];
        int rlt = 100_000_000;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < trees; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < apple; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            int idx = Arrays.binarySearch(arr, tmp);

            if (idx >= 0) {
                rlt = 0;
                break;
            } else {
                idx = -idx - 1;
                int d1 = (idx < trees) ? Math.abs(arr[idx] - tmp) : Integer.MAX_VALUE;
                int d2 = (idx > 0) ? Math.abs(arr[idx - 1] - tmp) : Integer.MAX_VALUE;
                rlt = Math.min(rlt, Math.min(d1, d2));
            }
        }
        

        bw.write(String.valueOf(rlt));
        bw.close();
    }
}