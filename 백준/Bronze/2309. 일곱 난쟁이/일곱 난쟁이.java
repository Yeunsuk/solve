import java.util.*; //2309(정렬) 일곱 난쟁이
import java.io.*;

public class Main {
    static boolean flag = false;
    static int stoi(String str) {
        return Integer.parseInt(str);
    }

    static void find(int[] arr, int stt, int dep, int sum, int[] tmp) {
        if(flag) return;

        if(dep == 7) {
            if(sum == 100) {
                for(int i = 0; i < 7; i++) System.out.println(tmp[i]);
                flag = true;
            }
            
            return;
        }

        for (int i = stt; i < arr.length; i++) {
            tmp[dep] = arr[i];
            
            find(arr, i + 1, dep + 1, sum + arr[i], tmp);
            if(flag) return;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        
        for (int i = 0; i < 9; i++) arr[i] = stoi(br.readLine());
        Arrays.sort(arr);

        find(arr, 0, 0, 0, new int[7]);
    }
}
