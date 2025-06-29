import java.util.*; //1246(그리디) 온라인 판매
import java.io.*;

public class Main {
    static int stoi(String str) {
        return Integer.parseInt(str);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int egg = stoi(st.nextToken()), std = 0;
        int num = stoi(st.nextToken());
        int arr[] = new int[num];
        long sum = 0;
        
        for(int i = 0; i < num; i++) {
            arr[i] = stoi(br.readLine());
        }
        
        for(int i = 0; i < num; i++) {
            int cnt = 0;
            
            for(int j = 0; j < num; j++) {
                if(arr[i] <= arr[j]) cnt++;
                if(cnt == egg) break;
            }

            if(sum < cnt * arr[i]) {
                sum = cnt * arr[i];
                std = arr[i];
            }
        }


        bw.write(std + " " + sum);
        bw.close();
    }
}