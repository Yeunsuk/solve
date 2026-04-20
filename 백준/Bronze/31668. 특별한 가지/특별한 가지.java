import java.util.*; //31668(수학) 특별한 가지
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Macro(br.readLine());

    bw.write(String.valueOf((Macro(br.readLine()) / num) * Macro(br.readLine())));
    bw.close();
  }
}