import java.util.*; //31867(수학) 홀짝홀짝
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int len = Integer.parseInt(br.readLine()), odd = 0, eve = 0;
    String num = br.readLine();
    
    for(int i = 0; i < len; i++) {
      int tmp = Character.getNumericValue(num.charAt(i)) % 2;
      if(tmp == 1) odd++;
      else eve++;
    }

    if(odd == eve) bw.write("-1");
    else bw.write(odd > eve ? "1" : "0");
    bw.close();
  }
}