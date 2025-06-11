import java.util.*; //33528(문자열) Alphabetic Shift
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        char[] arr = str.toCharArray();
        for(int i = 0; i < 26; i++) {
            StringBuilder sb = new StringBuilder();

            for(char ch : arr) {
                if (ch == ' ') sb.append(' ');
                else {
                    int tmp = (ch - 'A' - i + 26) % 26 + 'A';
                    sb.append((char) tmp);
                }
            }

            bw.write(sb.toString() + "\n");
        }
        
        bw.close();
    }
}