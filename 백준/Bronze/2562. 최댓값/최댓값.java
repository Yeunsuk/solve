import java.util.*; //2562(구현) 최댓값
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int max = 0, idx = -1;
    
    for(int i = 0; i < 9; i++) {
      int tmp = Integer.parseInt(br.readLine());
      if(max < tmp) {
        idx = i + 1;
        max = tmp;
      }
    }

    bw.write(max + "\n" + idx);
    bw.close();
  }
}