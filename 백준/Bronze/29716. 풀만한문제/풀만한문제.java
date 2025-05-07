import java.util.*; //29716(수학) 풀만한문제
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int std = Integer.parseInt(st.nextToken()), rlt = 0;
    int Test = Integer.parseInt(st.nextToken());

    while(Test-- > 0) {
      String str = br.readLine();
      int len = str.length();
      int cnt = 0;

      for(int i = 0; i < len; i++) {
        if(Character.isUpperCase(str.charAt(i))) cnt += 4;
        else if(str.charAt(i) == ' ') cnt++;
        else cnt += 2;
      }
      
      if(cnt <= std) rlt++;
    }
    
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}