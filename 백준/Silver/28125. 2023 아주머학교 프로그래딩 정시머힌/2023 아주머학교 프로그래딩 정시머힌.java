import java.util.*; //28125(문자열) 2023 아주머학교 프로그래딩 정시머힌
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Test = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        while(Test-- > 0) {
            char[] chArr = br.readLine().toCharArray();
            StringBuilder str = new StringBuilder();
            int cnt = 0, tmp = 0;
            
            for(char ch : chArr) {
                switch (ch) {
                    case '@':
                        str.append('a');
                        cnt++;
                        break;
                    case '[':
                        str.append('c');
                        cnt++;
                        break;
                    case '!':
                        str.append('i');
                        cnt++;
                        break;
                    case ';':
                        str.append('j');
                        cnt++;
                        break;
                    case '^':
                        str.append('n');
                        cnt++;
                        break;
                    case '0':
                        str.append('o');
                        cnt++;
                        break;
                    case '7':
                        str.append('t');
                        cnt++;
                        break;
                    case '\\':
                        tmp++;
                        break;
                    case '\'':
                        if(tmp == 1) {
                            str.append('v');
                            tmp = 0;
                            cnt++;
                        }else if (tmp == 2) {
                            str.append('w');
                            tmp = 0;
                            cnt++;
                        }else str.append(ch);
                        break;
                    default:
                        str.append(ch);
                        break;
                }
            }
            
            int len = str.length();
            if(len % 2 == 1) len += 1;
            if(len / 2 <= cnt) sb.append("I don't understand").append('\n');
            else sb.append(str).append('\n');
        }
        
        bw.write(sb.toString());
        bw.close();
    }
}