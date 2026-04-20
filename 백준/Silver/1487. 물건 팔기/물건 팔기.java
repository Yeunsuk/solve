import java.util.*; //1487(브루트포스) 물건 팔기
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Macro(br.readLine()), sum = 0, rlt = 0;
    int[][] arr = new int[num][2];

    for (int i = 0; i < num; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      arr[i][0] = Macro(st.nextToken());
      arr[i][1] = Macro(st.nextToken());
    }

    Arrays.sort(arr, (a, b) -> a[0] - b[0]);
    for(int i = 0; i < num; i++) {
      int tmp = 0;

      for(int j = i; j < num; j++) {
        if(0 < arr[i][0] - arr[j][1]) tmp += arr[i][0] - arr[j][1];
      }
      
      if(tmp > sum) {
        rlt = arr[i][0];
        sum = tmp;
      }
    }
      
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}