import java.util.*; //11720(수학) 숫자의 합
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()), rlt = 0;
    String a = br.readLine();

    for(int i = 0; i < n; i++) rlt += a.charAt(i) - '0';
    bw.write(String.valueOf(rlt));
    bw.flush();
  }
}