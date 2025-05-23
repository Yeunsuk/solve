import java.util.*; //17968(dp) Fire on Field
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num + 1];
        if(num >= 1) arr[1] = 1;
        arr[0] = 1;
        
        for(int i = 2; i <= num; i++) {
            int tmp = 1;
            
            while(true) {
                boolean std = true;
                for(int j = 1; i - 2 * j >= 0; j++) {
                    if(tmp == 2 * arr[i - j] - arr[i - 2 * j]) {
                        std = false;
                        break;
                    }
                }

                if(std) {
                    arr[i] = tmp;
                    break;
                }
                
                tmp++;
            }
        }


        bw.write(String.valueOf(arr[num]));
        bw.close();
    }
}