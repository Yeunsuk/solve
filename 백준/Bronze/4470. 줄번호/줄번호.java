import java.util.*; //4470(문자열) 줄번호
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int num = Integer.parseInt(br.readLine());
    
    for(int i = 1; i <= num; i++) sb.append(i).append(". ").append(br.readLine()).append("\n");
    bw.write(sb.toString());
    bw.close();
  }
}