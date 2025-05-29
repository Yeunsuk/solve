import java.util.*; //10808(문자) 알파벳 개수
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];
        
        for(char ch : br.readLine().toCharArray()) arr[ch - 'a']++;
        for(int i = 0; i < 26; i++) sb.append(arr[i]).append(' ');
        bw.write(sb.toString());
        bw.close();
    }
}