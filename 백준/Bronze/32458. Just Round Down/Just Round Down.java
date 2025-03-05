import java.util.*; //32458(구현) Just Round Down
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split("\\.");
    bw.write(input[0]);
    bw.close();
  }
}