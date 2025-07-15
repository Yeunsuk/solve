import java.util.*; //1138(그리디) 한 줄로 서기
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int arr[] = new int[num], rlt[] = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int j = 0; j < num; j++) arr[j] = Integer.parseInt(st.nextToken());
            
        for(int i = 0; i < num; i++) {
            int cnt = arr[i];
            
            for(int j = 0; j < num; j++) {
                if(rlt[j] == 0) {
                    if(cnt == 0) {
                        rlt[j] = i + 1;
                        break;
                    }
                    
                    cnt--;
                }
            }
        }

        for(int i = 0; i < num; i++) sb.append(rlt[i] + " ");
        bw.write(sb.toString());
        bw.close();
    }
}