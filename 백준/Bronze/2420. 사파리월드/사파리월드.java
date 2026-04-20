import java.util.*; //2420(수학) 사파리월드
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    long a = Integer.parseInt(st.nextToken());
    long b = Integer.parseInt(st.nextToken());
    
    br.close();
    System.out.print(Math.abs(a - b));
  }
}