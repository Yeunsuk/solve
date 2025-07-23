import java.util.*; //15720(그리디) 카우버거
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = 1_001, rlt1 = 0, rlt2 = 0;
        Integer array[][] = new Integer[3][];
        int arr[] = new int[3];
         
        for(int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            min = Math.min(min, arr[i]);
        }
        
        array[0] = new Integer[arr[0]];
        array[1] = new Integer[arr[1]];
        array[2] = new Integer[arr[2]];

        for(int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < arr[i]; j++) array[i][j] = Integer.parseInt(st.nextToken());
            Arrays.sort(array[i], Collections.reverseOrder());
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < arr[i]; j++) {
                rlt2 += (j < min) ? array[i][j] * 0.9 : array[i][j];
                rlt1 += array[i][j];
            }
        }
        
        bw.write(rlt1 + "\n" + rlt2);
        bw.close();
    }
}