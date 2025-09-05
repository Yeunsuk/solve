import java.util.*; // 15973(기하학) 두 박스
import java.io.*;

public class Main {
    static int Macro(String str) {
        return Integer.parseInt(str);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[8];
        StringTokenizer st;
        
        for(int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = i * 4; j < i * 4 + 4; j++)
            arr[j] = Integer.parseInt(st.nextToken());
        }
        
        if(arr[0] > arr[6] || arr[1] > arr[7] || arr[4] > arr[2] || arr[5] > arr[3]) bw.write("NULL\n");
        else if((arr[0] == arr[6] && arr[1] == arr[7]) || (arr[4] == arr[2] && arr[5] == arr[3]) || (arr[0] == arr[6] && arr[3] == arr[5]) || (arr[4] == arr[2] && arr[7] == arr[1])) bw.write("POINT\n");
        else if(arr[0] == arr[6] || arr[1] == arr[7] || arr[4] == arr[2] || arr[5] == arr[3]) bw.write("LINE\n");
        else bw.write("FACE\n");    
        bw.close();
    }
}