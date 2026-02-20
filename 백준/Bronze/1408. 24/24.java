import java.util.*; //1408 24
import java.io.*;

public class Main {
  static int stoi(String s) {
    return Integer.parseInt(s);
  }
  
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), ":");
    int a = (3600*stoi(st.nextToken())) + (60*stoi(st.nextToken())) + stoi(st.nextToken());

    st = new StringTokenizer(br.readLine(), ":");
    int b = (3600*stoi(st.nextToken())) + (60*stoi(st.nextToken())) + stoi(st.nextToken());
    
    int rlt = b>a ? b-a : 86400 - a + b;
    System.out.format("%02d:%02d:%02d", (rlt/3600), ((rlt/60)%60), (rlt%60));
  }
}