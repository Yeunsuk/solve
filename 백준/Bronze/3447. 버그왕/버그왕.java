import java.util.*; //3447(문자열) 버그왕
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String str = "";
    
    while((str = br.readLine()) != null) {
      while(str.contains("BUG")) {
        str = str.replaceAll("BUG", "");
      }
      
      sb.append(str).append("\n");
    }

    bw.write(sb.toString());
    bw.close();
  }
}