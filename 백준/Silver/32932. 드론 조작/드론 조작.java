import java.util.*; //32932(구현) 드론 조작
import java.io.*;

public class Main {
    static int encode(int x, int y) {
        return (x + 500) * 1001 + (y + 500);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken()), x = 0;
        int k = Integer.parseInt(st.nextToken()), y = 0;
        Set<Integer> set = new HashSet<>();
      
        for(int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            set.add(encode(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        String str = br.readLine();
        for(int i = 0; i < k; i++) {
            char tmp = str.charAt(i);
            if(tmp == 'U') {
                if(set.contains(encode(x, y + 1))) continue;
                else y++;
            }else if(tmp == 'D') {
                if(set.contains(encode(x, y - 1))) continue;
                else y--;
            }else if(tmp == 'R') {
                if(set.contains(encode(x + 1, y))) continue;
                else x++;
            }else {
                if(set.contains(encode(x - 1, y))) continue;
                else x--;
            }
        }
    
        bw.write(x + " " + y);
        bw.close();
    }
}