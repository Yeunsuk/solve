import java.util.*; // 18187(기하학) 평면 분할
import java.io.*;

public class Main {   
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine()), rlt = 1, std = 3;
    int[] arr = new int[101];
    arr[1] = 2; arr[2] = 4;
    
    for(int i = 3; i <= num; i++) {
        arr[i] = arr[i - 1] + std;
        if(i % 3 != 0) std++;
    }
    
    bw.write(String.valueOf(arr[num]));
    bw.close();
  }
}