import java.util.*; //2292(수학) 벌집
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine()), rlt = 1, max = 1;
    while (num > max) max += 6 * rlt++;
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}