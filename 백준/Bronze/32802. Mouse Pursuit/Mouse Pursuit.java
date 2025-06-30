import java.util.*; //32802(수학) Mouse Pursuit
import java.io.*;

public class Main {
    static int stoi(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, int[]> map = new HashMap<>();
        int Test = stoi(br.readLine());
        long sum1 = 0, sum2 = 0;

        while(Test-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int sec = stoi(st.nextToken());
            map.putIfAbsent(sec, new int[2]);

            if(str.equals("MISS")) {
                map.get(sec)[0] = -stoi(st.nextToken());
                map.get(sec)[1] = -stoi(st.nextToken());
            }else {
                map.get(sec)[0] = stoi(st.nextToken());
                map.get(sec)[1] = stoi(st.nextToken());
            }
        }

        int std = Integer.parseInt(br.readLine());
        for(Map.Entry<Integer, int[]> tmp : map.entrySet()) {
            int second = tmp.getKey();

            if(second < std) {
                sum1 += tmp.getValue()[0];
                sum2 += tmp.getValue()[1];
            }
        }

        bw.write(sum1 + " " + sum2);
        bw.close();
    }
}