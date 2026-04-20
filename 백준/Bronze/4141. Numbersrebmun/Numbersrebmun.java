import java.util.*; //4141(구현) Numbersrebmun
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    
    while(Test-- > 0) {
      StringBuilder sb = new StringBuilder(br.readLine().toUpperCase());
      
      for(int i = 0; i < sb.length(); ++i) {
        char tmp = sb.charAt(i);
        if(tmp <= 'C') sb.setCharAt(i, '2');
        else if(tmp <= 'F') sb.setCharAt(i, '3');
        else if(tmp <= 'I') sb.setCharAt(i, '4');
        else if(tmp <= 'L') sb.setCharAt(i, '5');
        else if(tmp <= 'O') sb.setCharAt(i, '6');
        else if(tmp <= 'S') sb.setCharAt(i, '7');
        else if(tmp <= 'V') sb.setCharAt(i, '8');
        else sb.setCharAt(i, '9');
      }

      bw.write(sb.toString().equals(sb.reverse().toString()) ? "YES\n" : "NO\n");
    }
    
    bw.close();
  }
}