import java.util.*; //5358(구현) Football Team
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String str;
    
    while((str = br.readLine()) != null && !str.isEmpty()) {
      char[] arr = str.toCharArray();
      
      for(char a : arr) {
        if(a == 'e') sb.append('i');
        else if(a == 'i') sb.append('e');
        else if(a == 'E') sb.append('I');
        else if(a == 'I') sb.append('E');
        else sb.append(a);
      }
      
      sb.append("\n");
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}