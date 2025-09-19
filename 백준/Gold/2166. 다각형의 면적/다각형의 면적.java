import java.util.*; // 2166(기하학) 다각형의 면적
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    long[][] arr = new long[num + 1][2];
    long rlt = 0;

    for(int i = 0; i < num; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      arr[i][0] = Integer.parseInt(st.nextToken());
      arr[i][1] = Integer.parseInt(st.nextToken());
    }

    arr[num][0] = arr[0][0];
    arr[num][1] = arr[0][1];
    for(int i = 0; i < num; i++) {
      rlt += arr[i][0] * arr[i + 1][1]; 
      rlt -= arr[i][1] * arr[i + 1][0];
    }
    
    bw.write(Math.abs(rlt / 2) + (rlt % 2 == 0 ? ".0" : ".5"));
    bw.close();
  }
}