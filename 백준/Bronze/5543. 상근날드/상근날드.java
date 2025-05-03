import java.util.*; //5543(수학) 상근날드
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int bgr = 2001, drk = 2001;
    
    for(int i = 0; i < 3; i++) {
      int tmp = Integer.parseInt(br.readLine());
      if(tmp < bgr) bgr = tmp;
    }
    
    for(int i = 0; i < 2; i++) {
      int tmp = Integer.parseInt(br.readLine());
      if(tmp < drk) drk = tmp;
    }
    
    bw.write(String.valueOf(bgr + drk - 50));
    bw.close();
  }
}