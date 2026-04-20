import java.util.*; //11651(정렬) 좌표 정렬하기 2
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[n][2];
    StringTokenizer st;
    
    for(int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      arr[i][1] = Integer.parseInt(st.nextToken());
      arr[i][0] = Integer.parseInt(st.nextToken());
    }

    br.close();
    Arrays.sort(arr, (xy1, xy2) -> {
      if(xy1[0] == xy2[0]) return xy1[1] - xy2[1];
      else return xy1[0] - xy2[0];
    });

    for(int i = 0 ; i < n ; i++) bw.write(String.valueOf(arr[i][1]) + " " + String.valueOf(arr[i][0]) + "\n");
    bw.close();
  }
}