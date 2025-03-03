import java.util.*; //21553(애드 혹) 암호 만들기
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();
    
    bw.write(br.readLine());
    bw.close();
  }
}