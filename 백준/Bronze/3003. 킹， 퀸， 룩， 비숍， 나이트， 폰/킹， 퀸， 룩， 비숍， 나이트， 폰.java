import java.util.*; //3003(수학) 킹, 퀸, 룩, 비숍, 나이트, 폰
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    int[] arr = {1, 1, 2, 2, 2, 8};

    for(int i = 0; i < 6; i++) {
      int tmp = Integer.parseInt(st.nextToken());
      sb.append(arr[i] - tmp).append(" ");
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}