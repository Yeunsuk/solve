import java.util.*; //2744(문자열) 대소문자 바꾸기
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] str = br.readLine().toCharArray();

    for(int i = 0; i < str.length; i++) {
      if(str[i] >= 'A' && str[i] <= 'Z') str[i] = (char)(str[i] + 32);
      else if(str[i] >= 'a' && str[i] <= 'z') str[i] = (char)(str[i] - 32);
    }
    
    bw.write(String.valueOf(str));
    bw.close();
  }
}