import java.util.*; //13450(dp) László Babai
import java.io.*;

public class Main {
  static int stoi(String s) { return Integer.parseInt(s); }
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int Test = stoi(br.readLine()), a, b;

    while(Test-- > 0) {
      a = stoi(br.readLine());
      for(int i = 0; i < a; i++) br.readLine();
      
      b = stoi(br.readLine());
      for(int i = 0; i < b; i++) br.readLine();
      
      sb.append(a == b ? "yes\n" : "no\n");
    }
    
    bw.write(sb.toString()); 
    bw.close();
  }
}