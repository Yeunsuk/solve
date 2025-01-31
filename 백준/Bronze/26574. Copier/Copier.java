import java.util.*; //26574(구현) Copier
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    
    while(Test-- > 0) {
      int tmp = Integer.parseInt(br.readLine());
      bw.write(tmp + " " + tmp + "\n");
    }
    
    bw.close();
  }
}