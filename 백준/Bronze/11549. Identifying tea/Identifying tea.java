import java.io.*; //11549 Identifiying tea
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine()), rlt=0;
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0; i<5; i++) if(Integer.parseInt(st.nextToken())==n) rlt++;
    System.out.print(rlt);
  }
}