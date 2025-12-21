import java.util.*; //5928(구현) Contest Timing
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int d = Integer.parseInt(st.nextToken());
    int h = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int ans = m + 60*h + 1440*d - 16511;

    bw.write(ans < 0 ? "-1" : String.valueOf(ans));
    bw.close();
  }
}