import java.util.*; //1149(dp) RPG거리 
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()), i;
    int[][] arr = new int[n][3];
    StringTokenizer st;
    
    for(i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      arr[i][0] = Macro(st.nextToken());
      arr[i][1] = Macro(st.nextToken());
      arr[i][2] = Macro(st.nextToken());
    }

    for(i = 1; i < n; i++) {
      arr[i][0] += Math.min(arr[i - 1][1], arr[i - 1][2]);
      arr[i][1] += Math.min(arr[i - 1][0], arr[i - 1][2]);
      arr[i][2] += Math.min(arr[i - 1][1], arr[i - 1][0]);
    }

    int rlt = Math.min(Math.min(arr[n - 1][0], arr[n - 1][1]), arr[n - 1][2]);
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}