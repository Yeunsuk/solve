import java.util.*; //2033(수학) 반올림
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double num = Integer.parseInt(br.readLine());
    int len = 10;
    
    while(num > len) {
      num = Math.round(num / len) * len;
      len *= 10;
    }

    bw.write(String.valueOf((int)num));
    bw.close();
  }
}