import java.util.*; //10818(구현) 최소, 최대
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int min = 1_000_000, max = -1_000_000;
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < num; i++) {
      int tmp = Integer.parseInt(st.nextToken());
      if(tmp < min) min = tmp;
      if(tmp > max) max = tmp;
    }
    
    bw.write(min + " " + max);
    bw.close();
  }
}