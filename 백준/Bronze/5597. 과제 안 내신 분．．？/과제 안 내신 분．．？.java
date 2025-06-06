import java.util.*; //5597(구현) 과제 안 내신 분..?
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[30];

        for(int i = 0; i < 28; i++) arr[Integer.parseInt(br.readLine()) - 1] = true;
        for(int i = 0; i < 30; i++) if(!arr[i]) bw.write((i + 1) + "\n");
        bw.close();
    }
}