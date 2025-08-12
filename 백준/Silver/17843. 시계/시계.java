import java.util.*; //17843(기하학) 시계
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Test = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(Test-- > 0) {
            double[] arr = new double[3];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < 3; i++) arr[i] = Integer.parseInt(st.nextToken());
            
            arr[1] += arr[2] / 60.0;
            arr[0] *= 5.0;
            arr[0] += (arr[1] / 60.0) * 5.0;
            Arrays.sort(arr);

            double  rlt = 360.0;
            for(int i = 1; i < 3; i++) {
                double tmp = (arr[i] - arr[i - 1]) * 6.0;
                rlt = Math.min(rlt, tmp);
            }
            
            rlt = Math.min(rlt, (arr[0] + 60.0 - arr[2]) * 6.0);
            sb.append(String.format("%.6f\n", rlt));
        }

        bw.write(sb.toString());
        bw.close();
    }
}