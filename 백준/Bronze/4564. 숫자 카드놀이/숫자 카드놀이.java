import java.util.*; //4564(수학) 숫자 카드놀이
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(num != 0) {
            int tmp = num;

            while(true) {
                int sum = 1;
                if(tmp > 9) {
                    sb.append(tmp).append(' ');
                    while(tmp != 0) {
                        sum *= tmp % 10;
                        tmp /= 10;
                    }
                    tmp = sum;
                }else {
                    sb.append(tmp).append('\n');
                    break;
                }
            }
            num = Integer.parseInt(br.readLine());
        }

        bw.write(sb.toString());
        bw.close();
    }
}