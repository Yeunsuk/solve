import java.util.*; //25325(자료구조) 학생 인기도 측정
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Test = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < Test; i++) map.put(st.nextToken(), 0);

        while(Test-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            while(st.hasMoreTokens()) {
                String tmp = st.nextToken();
                map.put(tmp, map.get(tmp) + 1);
            }
        }

        List<String> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> {
            if(map.get(a) - map.get(b) == 0) return a.compareTo(b);
            else return map.get(b) - map.get(a);
        });

        for(String str : list) {
            sb.append(str).append(" ").append(map.get(str)).append('\n');
        }

        bw.write(sb.toString());
        bw.close();
    }
}