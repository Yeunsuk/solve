import java.util.*; //1337(구현) 올바른 배열
import java.io.*;

public class Main {
    static int stoi(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        int max = 0;
        
        for(int i = 0; i < num; i++) set.add(Integer.parseInt(br.readLine()));

        for(int tmp : set) {
            int cnt = 0;
            
            for(int i = 0; i < 5; i++) if(set.contains(tmp + i)) cnt++;
            max = Math.max(max, cnt);
        }

        bw.write(String.valueOf(5 - max));
        bw.close();
    }
}