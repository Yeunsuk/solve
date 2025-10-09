import java.util.*; //5596(구현) 시험점수
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int sum1 = 0, sum2 = 0;
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < 4; i++) sum1 += Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < 4; i++) sum2 += Integer.parseInt(st.nextToken());

    bw.write(Math.max(sum1, sum2) + "\n");
    bw.close();
  }
}