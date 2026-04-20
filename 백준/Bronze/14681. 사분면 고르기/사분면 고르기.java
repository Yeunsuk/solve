import java.util.*; //14681(기하학) 사분면 고르
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int x = Macro(br.readLine());
    int y = Macro(br.readLine());

    if(x > 0) {
      if(y > 0) bw.write("1");
      else bw.write("4");
    }else {
      if(y > 0) bw.write("2");
      else bw.write("3");
    }
    
    bw.flush();
  }
}