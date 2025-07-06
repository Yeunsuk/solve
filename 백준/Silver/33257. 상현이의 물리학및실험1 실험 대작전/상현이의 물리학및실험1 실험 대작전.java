import java.util.*; //33257(그리디) 상현이의 물리학및실험1 실험 대작전
import java.io.*;

public class Main {
    static int stoi(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = stoi(st.nextToken()), cnt = 1;
        int E = stoi(st.nextToken());
        int arr[] = new int[num];
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < num; i++) arr[i] = stoi(st.nextToken());
        Arrays.sort(arr);

        for(int i = 1; i < num; i++) if(arr[i] - arr[i - 1] >= E) cnt++;
        bw.write(cnt + "\n");
        bw.close();
    }
}