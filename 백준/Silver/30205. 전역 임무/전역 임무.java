import java.util.*; //30205(그리디) 전역 임무
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int number = Integer.parseInt(st.nextToken());
        int floor = Integer.parseInt(st.nextToken());
        long std = Integer.parseInt(st.nextToken());
        int arr[] = new int[floor];

        for(int i = 0; i < number; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < floor; j++) arr[j] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
            int cnt = 0;

            for(int tmp : arr) {
                if(tmp == -1) cnt++;
                else if(tmp <= std) std += tmp;
                else {
                    while(tmp > std && cnt > 0) {
                        std *= 2;
                        cnt--;
                    }
                    
                    if(tmp <= std) std += tmp;
                    else {
                        bw.write("0");
                        bw.close();
                        return;
                    }
                }
            }
            
            while(cnt-- > 0) std *= 2;
        }

        bw.write("1");
        bw.close();
    }
}