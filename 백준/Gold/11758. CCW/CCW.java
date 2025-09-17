import java.util.*; // 11758(기하학) CCW
import java.io.*;

public class Main { 
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int arr[] = new int[6];
    
    for(int i = 0; i < 3; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j = 0; j < 2; j++) arr[i * 2 + j] = Integer.parseInt(st.nextToken());
    }
    
    int std = arr[0] * arr[3] + arr[2] * arr[5] + arr[4] * arr[1] - arr[2] * arr[1] - arr[4] * arr[3] - arr[0] * arr[5];
    bw.write(std > 0 ? "1" : std < 0 ? "-1" : "0");
    bw.close();
  }
}