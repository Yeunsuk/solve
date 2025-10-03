import java.util.*; //10998(구현) AxB
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    bw.write(String.valueOf(Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken())));
    bw.close();
  }
}