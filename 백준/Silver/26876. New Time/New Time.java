import java.util.*; //26876(graphs) New Time
import java.io.*;

public class Main {
  static int stoi(String s) { return Integer.parseInt(s); }
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), ":");
    int a1 = stoi(st.nextToken()), b1 = stoi(st.nextToken());
    
    st = new StringTokenizer(br.readLine(), ":");
    int a2 = stoi(st.nextToken()), b2 = stoi(st.nextToken()), rlt = 0;

    while(b1 != b2) {
      b1++;
      rlt++;
      if(b1 == 60) {
        b1 -= 60;
        a1++;
        if(a1 == 24) a1 -= 24;
      }
    }
    
    while(a1 != a2) {
      a1++;
      rlt++;
      if(a1 == 24) a1 -= 24;
    }
    
    bw.write(String.valueOf(rlt)); 
    bw.close();
  }
}