import java.util.*; //5524(구현) 입실 관리
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    while(Test-- > 0) {
      String str = br.readLine();
      
      for(int i = 0; i < str.length(); i++) 
        sb.append(('A' <= str.charAt(i) && str.charAt(i) <= 'Z') ? (char)(str.charAt(i) + 32) : str.charAt(i));
      sb.append("\n");
    }

    bw.write(sb.toString());
    bw.close();
  }
}