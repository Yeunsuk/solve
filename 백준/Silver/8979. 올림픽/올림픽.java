import java.util.*; //8979(구현) 올림픽
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num = Integer.parseInt(st.nextToken());
    int tgt = Integer.parseInt(st.nextToken());
    int[][] arr = new int[num + 1][4];
    int rlt = 1;
    
    for(int i = 1; i <= num; i++) {
      st = new StringTokenizer(br.readLine());
      int tmp = Integer.parseInt(st.nextToken());
      arr[tmp][0] = Integer.parseInt(st.nextToken());
      arr[tmp][1] = Integer.parseInt(st.nextToken());
      arr[tmp][2] = Integer.parseInt(st.nextToken());
    }

    br.close();
    for(int i = 1; i <= num; i++) {
      if(arr[i][0] > arr[tgt][0]) rlt++;
      else if(arr[i][0] == arr[tgt][0]) {
        if(arr[i][1] > arr[tgt][1]) rlt++;
        else if(arr[i][1] == arr[tgt][1] && arr[i][2] > arr[tgt][2]) rlt++;
      }
    }
    
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}