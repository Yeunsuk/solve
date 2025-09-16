import java.util.*; // 26646(기하학) 알프스 케이블카
import java.io.*;

public class Main {   
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int[] arr = new int[num];
    long rlt = 0;

    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < num; i++) arr[i] = Integer.parseInt(st.nextToken());
    
    for(int i = 0; i < num - 1; i++) rlt += (arr[i] * arr[i] * 2) + (arr[i + 1] * arr[i + 1] * 2);
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}