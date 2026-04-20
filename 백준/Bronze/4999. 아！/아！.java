import java.util.*; //4999(구현) 아!
import java.io.*;

public class Main { 
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int std = br.readLine().length();
    int tmp = br.readLine().length();

    bw.write(std >= tmp ? "go" : "no");
    bw.close();
  }
}