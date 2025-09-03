import java.util.*; // 21335(기하학) Another Eruption
import java.io.*;

public class Main { 
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double rlt = Math.sqrt(Long.parseLong(br.readLine()) * Math.PI);
        bw.write(String.valueOf(2 * rlt));
        bw.close();
    }
}