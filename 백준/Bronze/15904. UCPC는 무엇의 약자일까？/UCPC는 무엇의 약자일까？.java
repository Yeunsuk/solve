import java.util.*; //15904(그리디) UCPC는 무엇의 약자일까?
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split("");
    br.close();
    int i = 0;
    
    
    for(String s : str) {
      if(i == 0 && s.equals("U")) i++;
      if(i == 2 && s.equals("P")) i++;
      if((i == 1 || i == 3) && s.equals("C")) i++;
    }
    
    if(i==4) bw.write("I love UCPC");
    else bw.write("I hate UCPC");
    bw.close();
  }
}