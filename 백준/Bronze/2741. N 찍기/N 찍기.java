import java.util.*; //2741(구현) N 찍기
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int num = Integer.parseInt(br.readLine()) + 1;
    
    for(int i = 1; i < num; i++) sb.append(i).append("\n");
    bw.write(sb.toString());
    bw.close();
  }
}