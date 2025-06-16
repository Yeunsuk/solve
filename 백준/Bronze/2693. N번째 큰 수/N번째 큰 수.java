import java.util.*; //2693(정렬) N번째 큰 수
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Test = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(Test-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[10];

            for(int i = 0; i < 10; i++) arr[i] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
            
            sb.append(arr[7]).append('\n');
        }
        
        bw.write(sb.toString());
        bw.close();
    }
}