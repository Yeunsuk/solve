import java.util.*; //28292(구현) 개미 수열
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());

    if(num < 3) bw.write("1");
    else bw.write(num > 5 ? "3" : "2");
    bw.close();
  }
}