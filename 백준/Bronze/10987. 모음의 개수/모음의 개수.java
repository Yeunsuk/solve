import java.util.*; //10987(구현) 모음의 개수
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int cnt = 0;

    for(int i=0; i<str.length(); i++) {
      char c = str.charAt(i);
      if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') cnt++;
    }
    
    System.out.print(cnt);
  }
}