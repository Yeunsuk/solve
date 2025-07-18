import java.util.*; //27674(그리디) A+B
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Test = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(Test-- > 0) {
            br.readLine();
            char[] chr = br.readLine().toCharArray();

            Character[] arr = new Character[chr.length];
            for(int i = 0; i < chr.length; i++) arr[i] = chr[i];
            Arrays.sort(arr, Collections.reverseOrder());
            

            StringBuilder str = new StringBuilder();
            for(int i = 0; i < arr.length - 1; i++) str.append(arr[i]);

            long a = Long.parseLong(str.toString()) + (arr[arr.length - 1] - '0');
            sb.append(a + "\n");
        }
            

        bw.write(sb.toString());
        bw.close();
    }
}