import java.util.*; //10769(문자열) 행복한지 슬픈지
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int pus = 0, mus = 0;
    
    for(int i = 0; i < str.length() - 2; i++) {
      if(str.substring(i, i + 3).equals(":-)")) pus++;
      else if(str.substring(i, i + 3).equals(":-(")) mus++;
    }
    
    if(pus == 0 && mus == 0) bw.write("none");
    else if(pus == mus) bw.write("unsure");
    else if(pus > mus) bw.write("happy");
    else bw.write("sad");
    bw.close();
  }
}