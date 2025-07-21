import java.util.*; //1448(그리디) 삼각형 만들기
import java.io.*;

public class Main {
    public static int Macro(int[] arr) {
        int len = arr.length;

        for(int i = len - 1; i >= 2; i--) {
            int c = arr[i - 2], b = arr[i - 1], a = arr[i];
            if(b + c > a) return a + b + c;
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        
        for(int i = 0; i < num; i++) arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        
        bw.write(String.valueOf(Macro(arr)));
        bw.close();
    }
}