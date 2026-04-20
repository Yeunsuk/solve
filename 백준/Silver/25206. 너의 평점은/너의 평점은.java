import java.util.*; //25206(구현) 너의 평점은
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String gd[] = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
    double scr[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};
    double n = 0, sum = 0;
    StringTokenizer st;
    
    for(int i = 0; i < 20; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      String na = st.nextToken();
      double num = Double.parseDouble(st.nextToken());
      String aph = st.nextToken();

      for (int j = 0; j < 10; j++) {
        if (aph.equals(gd[j])) {
          n += num * scr[j];
          if (j != 9) sum += num;
        }
      }
    }

    bw.write(String.valueOf(String.format("%.6f", n / sum)));
    bw.close();
  }
}