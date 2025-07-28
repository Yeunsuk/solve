import java.util.*; //11478(자료구조) 서로 다른 부분 문자열의 개수
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        Set<CharSequence> set = new HashSet<>();
        int len = sb.length();

        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j <= len; j++) {
                set.add(sb.subSequence(i, j));
            }
        }
        
        bw.write(set.size() + "\n");
        bw.close();
    }
}