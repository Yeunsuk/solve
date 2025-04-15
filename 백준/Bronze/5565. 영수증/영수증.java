import java.util.*; //5565(수학) 영수증
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int rlt = Integer.parseInt(br.readLine());

    for(int i = 0; i < 9; i++) rlt -= Integer.parseInt(br.readLine());
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}