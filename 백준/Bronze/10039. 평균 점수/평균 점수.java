import java.util.*; //10039(구현) 평균 점수
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int sum = 0;

    for(int i = 0; i < 5; i++) {
      int tmp = Integer.parseInt(br.readLine());
      sum += tmp < 40 ? 40 : tmp;
    }

    bw.write(sum / 5 + "\n");
    bw.close();
  }
}