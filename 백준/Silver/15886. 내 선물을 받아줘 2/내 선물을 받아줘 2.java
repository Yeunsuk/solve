import java.util.*; //15886(graphs) 내 선물을 받아줘 2
import java.io.*;

public class Main {
  static int stoi(String s) { return Integer.parseInt(s); }
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int len = Integer.parseInt(br.readLine()), cnt = 0;
    String str = br.readLine();

    for(int i = 0; i < len - 1; i++) {
      if(str.charAt(i) =='E' && str.charAt(i+1) == 'W') cnt++;
    }
    
    bw.write(String.valueOf(cnt));
    bw.close();
  }
}