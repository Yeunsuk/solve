import java.util.*; //1789(그리디) 수들의 합
import java.io.*;

public class Main {
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long num = Long.parseLong(br.readLine());
    br.close();
    int n = 1;
    
    while(true) {
      if(num >= n) num -= n;
      else break;
      n++;
    }
    
    bw.write(String.valueOf(--n));
    bw.close();
  }
}