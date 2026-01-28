import java.util.*; //2455(구현) 지능형 기차
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int max = 0, tmp = 0;
    
    for(int i = 0; i < 4; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      tmp -= Integer.parseInt(st.nextToken());
      tmp += Integer.parseInt(st.nextToken());
      max = Math.max(max, tmp);
    }
      
    System.out.print(max);
  }
}