import java.util.*; //11365(구현) !밀비 급일
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String str;
    
     while(!(str = br.readLine()).equals("END")) {
      for(int i = str.length() - 1; i > -1; i--) sb.append(str.charAt(i));
      sb.append("\n");
    }

    bw.write(sb.toString());
    bw.close();
  }
}