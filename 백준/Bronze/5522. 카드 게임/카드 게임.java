import java.util.*; //5522(수학) 카드 게임
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int rlt = 0;
    
    for(int i = 0; i < 5; i++) rlt += Macro(br.readLine());
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}