import java.util.*; //32978(자료구조) 아 맞다 마늘
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < num; i++) set.add(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i < num; i++) set.remove(st.nextToken());
        
        bw.write(String.join(", ", set));
        bw.close();
    }
}