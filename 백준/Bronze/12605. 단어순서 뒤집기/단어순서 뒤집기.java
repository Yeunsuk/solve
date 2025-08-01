import java.util.*; //12605(자료구조) 단어순서 뒤집기
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < num; i++) {
            sb.append("Case #").append(i + 1).append(": ");
            String arr[] = br.readLine().split(" ");
            
            for(int j = arr.length - 1; j >= 0; j--) sb.append(arr[j]).append(' ');
            sb.append('\n');
        }
        
        bw.write(sb.toString());
        bw.close();
    }
}