import java.util.*; //8723(기하학) Patyki
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        
        for(int i = 0; i < 3; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);

        if(arr[0] == arr[1] && arr[1] == arr[2]) bw.write("2");
        else if (arr[0] + arr[1] > arr[2]) {
            if (arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) bw.write("1");
            else bw.write("0");
        }
        else bw.write("0");
        bw.close();
    }
}