import java.util.*; //17608(자료구조) 막대기
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()),cnt = 0, std = 0;
        int[] arr = new int[num];
        
        for(int i = 0; i < num; i++) arr[i] = Integer.parseInt(br.readLine());
        for(int i = num - 1; i >= 0; i--) {
            if(arr[i] > std) {
                std = arr[i];
                cnt++;
            }
        }
        
        bw.write(String.valueOf(cnt));
        bw.close();
    }
}