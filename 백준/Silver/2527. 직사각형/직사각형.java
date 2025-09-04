import java.util.*; // 2527(기하학) 직사각형
import java.io.*;

public class Main { 
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[8];

            for(int j = 0; j < 8; j++) arr[j] = Integer.parseInt(st.nextToken());
            if(arr[0] > arr[6] || arr[1] > arr[7] || arr[4] > arr[2] || arr[5] > arr[3]) sb.append("d\n");
            else if((arr[0] == arr[6] && arr[1] == arr[7]) || (arr[4] == arr[2] && arr[5] == arr[3]) || (arr[0] == arr[6] && arr[3] == arr[5]) || (arr[4] == arr[2] && arr[7] == arr[1])) sb.append("c\n");
            else if(arr[0] == arr[6] || arr[1] == arr[7] || arr[4] == arr[2] || arr[5] == arr[3]) sb.append("b\n");
            else sb.append("a\n");
            
        }
        bw.write(sb.toString());
        bw.close();
    }
}