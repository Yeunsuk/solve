import java.util.*; //1076(구현) 저항
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] color = {"black", "brown", "red", "orange", "yellow", "green",
      "blue", "violet", "grey", "white"};
    String A = br.readLine();
    String B = br.readLine();
    String C = br.readLine();

    long rlt = (Arrays.asList(color).indexOf(A) * 10) + Arrays.asList(color).indexOf(B);
    rlt *= Math.pow(10, Arrays.asList(color).indexOf(C));
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}