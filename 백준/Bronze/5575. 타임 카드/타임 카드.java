import java.util.*; //5575(구현) 타임 카드
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int arr[] = new int[6];

    for(int i = 0; i < 3; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j = 0; j < 6; j++) arr[j] = Integer.parseInt(st.nextToken());
      int stt = (arr[0]*3600) + (arr[1]*60) + arr[2];
      int end = (arr[3]*3600) + (arr[4]*60) + arr[5];
      int tmp = end - stt;

      sb.append(tmp/3600).append(" ").append((tmp%3600)/60)
        .append(" ").append((tmp%3600)%60).append("\n");
    }

    bw.write(sb.toString());
    bw.close();
  }
}