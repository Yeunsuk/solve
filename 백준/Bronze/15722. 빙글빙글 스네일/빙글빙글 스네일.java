import java.util.*; //15722(구현) 빙글빙글 스네일
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int x = 0, y = 0, std = 0, cm = 1;

        while(num > 0) {
            int tmp = Math.min(cm, num);

            switch(std % 4) {
                case 0: y += tmp; break;
                case 1: x += tmp; break;
                case 2: y -= tmp; break;
                case 3: x -= tmp; break;
            }

            num -= tmp;
            std++;
            
            if(std % 2 == 0) cm++;
        }


        bw.write(x + " " + y);
        bw.close();
    }
}