import java.util.*; //2495(구현) 연속 구간
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    for(int i = 0; i < 3; i++) {
      String num = br.readLine();
      int max = 1, cnt = 1;
      
      for(int j = 1; j < 8; j++) {
        int std = Character.getNumericValue(num.charAt(j - 1));
        int tmp = Character.getNumericValue(num.charAt(j));
        
        if(std == tmp) cnt++;
        else cnt = 1;
        
        if(max < cnt) max = cnt;
      }
  
      bw.write(max + "\n");
    }
    
    bw.close();
  }
}