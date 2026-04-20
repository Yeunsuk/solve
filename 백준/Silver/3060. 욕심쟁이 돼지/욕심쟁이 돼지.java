import java.util.*; //3060(수학) 욕심쟁이 돼지
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int Test = Integer.parseInt(br.readLine());
    int sum = 0; int cnt = 0;
    StringTokenizer st;

    while(Test-- > 0) {
      int icm = Integer.parseInt(br.readLine());
      st = new StringTokenizer(br.readLine());
      sum = 0; cnt = 1;

      for(int i = 0; i < 6; i++) sum += Integer.parseInt(st.nextToken());

      while(sum <= icm) {
        sum *= 4;
        cnt++;
      }

      bw.write(String.valueOf(cnt) + "\n");
    }
    br.close();
    bw.close();
  }
}