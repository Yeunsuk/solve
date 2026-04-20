import java.util.*; //4659(구현) 비밀번호 발음하기
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] arr = {'a', 'e', 'i', 'o', 'u'};
    StringTokenizer st;
    
    while(true) {
      st = new StringTokenizer(br.readLine());
      String str = st.nextToken();
      
      if(str.equals("end")) break;
      else {
        boolean std = true, ctd = false;
        int cnt = 0, crr = 0;
        
        for(int i = 0; i < str.length(); i++) {
          char tmp = str.charAt(i);
          boolean stt = false;

          for(int j = 0; j < arr.length; j++) {
            if(tmp == arr[j]) {
              stt = true;
              ctd = true;
              cnt = 0;
              crr++;
              break;
            }
          }

          if(!stt) {
            cnt++;
            crr = 0;
          }

          if((i == str.length() - 1) && !ctd) {
            bw.write("<" + str + "> is not acceptable.\n");
            std = false;
            break;
          }
          
          if(i >= 1) {
            if(tmp == str.charAt(i-1) && tmp != 'e' && tmp != 'o') {
              bw.write("<" + str + "> is not acceptable.\n");
              std = false;
              break;
            }else if(crr >= 3 || cnt >= 3) {
              bw.write("<" + str + "> is not acceptable.\n");
              std = false;
              break;
            }
          }
        }
        
        if(std) bw.write("<" + str + "> is acceptable.\n");
      }
    }
    
    bw.close();
  }
}