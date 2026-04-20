import java.util.*; //4613(구현) Quicksum
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String str;

    while(true) {
      int n = 0;
      str = br.readLine();
      if(str.equals("#")) break;
      
      for(int i = 0; i < str.length(); i++) {
        if(str.charAt(i)!=' ') n += (str.charAt(i) - 64) * (i + 1);
      }

      sb.append(n + "\n");
    }

    bw.write(String.valueOf(sb));
    bw.close();
  }
}