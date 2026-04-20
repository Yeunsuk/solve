import java.util.*; //1159(구현) 농구 경기
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine());
    int[] arr = new int[26];
    boolean std = false;
    
    for(int i = 0; i < n; i++) {
      String str = br.readLine();
      char tmp = str.charAt(0);
      arr[tmp - 97]++;
      
      if(arr[tmp - 97] == 5) std = true;
    }
    
    if(std) {
      for(int i = 0; i < 26; i++) if(arr[i] >= 5) bw.write(String.valueOf((char)(i + 97)));
    }else bw.write("PREDAJA");
    bw.close();
  }
}