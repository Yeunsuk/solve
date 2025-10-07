import java.util.*; //10156(구현) 과자
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken());
    num = num < 0 ? 0 : num;
    System.out.println(num);
  }
}