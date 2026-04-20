import java.util.*; //1264(구현) 모음의 개수
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    char[] aeiou = {'a', 'e', 'i', 'o', 'u'};
    String line = "GG";
    
    while(!line.equals("#")) {
      line = br.readLine();
      line = line.toLowerCase();
      int cnt = 0;

        for(int i = 0; i < 5; i++) {
        for(int j = 0; j < line.length(); j++) {
          if(line.charAt(j) == aeiou[i]) cnt++;
        }
      }
      sb.append(cnt + "\n");
    }

    sb.deleteCharAt(sb.length() - 1);
    sb.deleteCharAt(sb.length() - 1);
    sb.deleteCharAt(sb.length() - 1);
    System.out.print(sb);
  }
}