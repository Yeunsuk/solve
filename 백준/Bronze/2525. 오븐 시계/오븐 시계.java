import java.util.*; //2525(구현) 오븐 시계
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int rlt = 60*Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + Integer.parseInt(br.readLine());
    System.out.print((rlt/60)%24 + " " + rlt%60);
  }
}