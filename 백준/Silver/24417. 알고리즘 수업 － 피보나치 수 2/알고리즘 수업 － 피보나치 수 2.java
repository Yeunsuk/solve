import java.util.*; //24417(graphs) 알고리즘 수업 - 피보나치 수 2
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine()), a = 1,b = 1, rlt = 0;
    if(num == 1 || num == 2) rlt = 1;
    else {
      for(int i = 3; i <= num; i++) {
        rlt = (a+b) % 1_000_000_007;
        a = b; b = rlt;
      }
    }
    
    bw.write(rlt + " " + (num - 2));
    bw.close();
  }
}