import java.util.*; //2605(자료구조) 줄 세우기
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= num; i++) {
            list.add(Integer.parseInt(st.nextToken()), i);
        }
        
        for(int i = list.size() - 1; i >= 0; i--) sb.append(list.get(i)).append(" ");
        bw.write(sb.toString());
        bw.close();
    }
}