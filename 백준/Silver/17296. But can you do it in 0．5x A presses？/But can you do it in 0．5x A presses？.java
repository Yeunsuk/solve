import java.util.*; //17296(구현) But can you do it in 0.5x A presses?
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine()), rlt;
    int arr[][] = new int[2][num];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < num; i++) {
      double tmp = Double.parseDouble(st.nextToken());
      arr[0][i] = (int)Math.floor(tmp);
      int std = (int)(tmp * 10) % 10;

      if(std == 0) arr[1][i] = 0;
      else arr[1][i] = 1;
    }

    rlt = arr[0][0] + arr[1][0];
    for(int i = 1; i < num; i++) {
      if(rlt == 0 && arr[1][i] == 1) rlt++;
      rlt += arr[0][i];
    }

    bw.write(String.valueOf(rlt));
    bw.close();
  }
}