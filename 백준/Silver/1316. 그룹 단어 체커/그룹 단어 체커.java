import java.util.*; //1316(구현) 그룹 단어 체커
import java.io.*;

public class Main {
  static int num, cnt, pre, tmp;
  static boolean Macro(String arr) {
    boolean[] check = new boolean[26]; 
    pre = -1;

    for(int i = 0; i < arr.length(); i++) {
      tmp = arr.charAt(i);

      if(pre != tmp){ 
        if(check[tmp - 97] == false) { 
          check[tmp - 97] = true;
          pre = tmp;
        }else return false;
      }else continue;
    }
    return true;
  }
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    num = Integer.parseInt(br.readLine());
    cnt = 0;

    for(int  i = 0; i  < num; i++) if(Macro(br.readLine())) cnt++;          
    br.close();
    
    bw.write(Integer.toString(cnt));
    bw.close();
  }
}