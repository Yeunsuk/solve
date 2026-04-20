import java.util.*; //10807(구현) 개수 세기
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Macro(br.readLine());
    int[] arr = new int[201];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < num; i++) arr[Macro(st.nextToken()) + 100]++;
    bw.write(String.valueOf(arr[Macro(br.readLine()) + 100]));
    bw.close();
  }
}