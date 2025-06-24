import java.util.*; //25945(그리디) 컨테이너 재배치
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()), sum = 0, sm = 0, lg = 0;
        int[] arr = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }

        int avg = sum / num;
        for(int cnt : arr) {
            if(cnt > avg + 1) lg += (cnt - avg - 1);
            else if(cnt < avg) sm += (avg - cnt);
        }

        bw.write(String.valueOf(Math.max(lg, sm)));
        bw.close();
    }
}