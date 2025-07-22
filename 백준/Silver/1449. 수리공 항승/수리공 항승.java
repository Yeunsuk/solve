import java.util.*; //1449(그리디) 수리공 항승
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken()), pre = -1001;
        int std = Integer.parseInt(st.nextToken()), cnt = 0;
        int[] arr = new int[num];
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < num; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);

        for(int i = 0; i < num; i++) {
            if(arr[i] - pre >= std) {
                pre = arr[i];
                cnt++;
            } 
        }
        
        bw.write(String.valueOf(cnt));
        bw.close();
    }
}