import java.util.*; //10872(구현) 팩토리얼
import java.io.*;

public class Main {
  static int[] arr = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    bw.write(String.valueOf(arr[num]));
    bw.close();
  }
}