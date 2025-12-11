import java.util.*; //5357(구현) Dedupe
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    while(Test-- > 0) {
      String str = br.readLine();
      sb.append(str.charAt(0));
      
      for(int i = 1; i < str.length(); i++) 
        if(str.charAt(i) != str.charAt(i-1))
          sb.append(str.charAt(i));

      sb.append("\n");
    }

    bw.write(sb.toString());
    bw.close();
  }
}