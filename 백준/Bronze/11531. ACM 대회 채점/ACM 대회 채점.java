import java.util.*; //11531(구현) ACM 대회 채점
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        int cnt = 0, sum = 0;
        StringTokenizer st;
        
        while(true) {
            st = new StringTokenizer(br.readLine());
            int time = Integer.parseInt(st.nextToken());
            if(time == -1) break;
            
            String team = st.nextToken();
            String std = st.nextToken();

            if(std.equals("wrong")) map.put(team, map.getOrDefault(team, 0) + 1);
            else {
                sum += time + (map.getOrDefault(team, 0) * 20);
                cnt++;
            }
        }
        
        bw.write(cnt + " " + sum);
        bw.close();
    }
}