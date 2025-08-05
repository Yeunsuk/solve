import java.util.*; //31562(자료구조) 전주 듣고 노래 맞히기
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String, String> map = new HashMap<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            String val = st.nextToken();
            String key = st.nextToken() + st.nextToken() + st.nextToken();

            if(!map.containsKey(key)) map.put(key, val);
            else map.put(key, "?");
        }
        
        for(int i = 0; i < m; i++) {
            String key = br.readLine().replaceAll("\\s+", "");;
            sb.append(map.containsKey(key) ? map.get(key) : "!").append('\n');
        }
        
        bw.write(sb.toString());
        bw.close();
    }
}