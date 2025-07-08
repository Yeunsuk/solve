import java.util.*; //14425(문자열) 문자열 집합
import java.io.*;

public class Main {
    static int stoi(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = stoi(st.nextToken()), m = stoi(st.nextToken());
        Set<String> set = new HashSet<>();
        int cnt = 0;
        
        for(int i = 0; i < n; i++) set.add(br.readLine());
        for(int i = 0; i < m; i++) {
            if(set.contains(br.readLine())) cnt++;
        }

        bw.write(String.valueOf(cnt));
        bw.close();
    }
}