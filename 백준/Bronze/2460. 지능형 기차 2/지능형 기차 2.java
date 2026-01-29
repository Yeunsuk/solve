import java.util.*; //2460(구현) 지능형 기차 2
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int m=0, t=0;

    for(int i=0; i<10; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      t -= Integer.parseInt(st.nextToken());
      t += Integer.parseInt(st.nextToken());
      if(m<t) m=t;
    }
    
    System.out.print(m);
  }
}